package com.example.solusresponsessystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        RuleSet ruleSet1 = new RuleSet("101");
        RuleSet ruleSet2 = new RuleSet("102");

        Rule rule1 = new Rule(ruleSet1);
        ruleSet1.getRules().add(rule1);

        Rule rule2 = new Rule(ruleSet2);
        rule2.setParent(ruleSet1);
        ruleSet2.getRules().add(rule2);

        ResponseType one = new ResponseType("YES");
        ResponseType two = new ResponseType("YES");
        ResponseType three = new ResponseType("NO");

        Question questionOne = new Question("1", Arrays.asList(one, two, three));
        questionOne.getResponseType().get(0).addRule(rule1);
        questionOne.getResponseType().get(1).addRule(rule2);
        questionOne.getResponseType().get(2).addRule(rule2); // da false, si fuera rule1 daria true

        //questionOne.processResponse("YES");
        questionOne.processResponse("NO");

    }
}

class Question {
    String id;
    List<ResponseType> responseTypes;

    public Question(String id, List<ResponseType> responseTypes) {
        this.id = id;
        this.responseTypes = responseTypes;
    }

    public String getId() {
        return id;
    }

    public List<ResponseType> getResponseType() {
        return responseTypes;
    }

    void processResponse(String response) {
        for(ResponseType responseType : responseTypes) {
            if(responseType.getResponse().equalsIgnoreCase(response)) {
                if(null != responseType.getRule()) {
                    System.out.println(responseType.getRule().getParent().getId());
                    responseType.getRule().setTriggered(true);
                    System.out.println(responseType.getRule().getParent().isRuleActive());
                } else {
                    if(null != responseType.getRule().getParent()) {
                        String id = responseType.getRule().parent.id;
                        responseType.getRule().setTriggered(false);
                        System.out.println("NO HAY MATCHES");
                    }
                    System.out.println("a tomar por culo");
                }
            }
        }
    }
}


class ResponseType {

    String response;
    Rule rule;

    public ResponseType(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public Rule getRule() {
        return rule;
    }

    void addRule(Rule rule) {
        this.rule = rule;
    }

}

class Rule {

    RuleSet parent;
    boolean isTriggered = false;

    public Rule(RuleSet parent) {
        this.parent = parent;
    }

    public RuleSet getParent() {
        return parent;
    }

    public Rule setParent(RuleSet parent) {
        this.parent = parent;
        return this;
    }

    public boolean isTriggered() {
        return isTriggered;
    }

    public void setTriggered(boolean triggered) {
        isTriggered = triggered;
    }
}

class RuleSet {
    String id;
    List<Rule> rules = new ArrayList<>();

    public RuleSet(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Rule> getRules() {
        return rules;
    }

    boolean isRuleActive() {
        return rules.stream().filter(r -> !r.isTriggered).count() == 0;
    }
}






