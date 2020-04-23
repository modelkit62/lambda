package com.example.design_patterns_applying.a_factory.search;

import com.example.design_patterns_applying.a_factory.dictionary.Language;
import com.example.design_patterns_applying.a_factory.helpers.HttpHelper;

import java.util.List;

import static com.example.design_patterns_applying.a_factory.helpers.JsonHelper.extractDefinitions;

public class WebServiceDefinitionSearch implements DefinitionSearch {

    private static final String URI = "https://googledictionaryapi.eu-gb.mybluemix.net/?define=";
    private final HttpHelper httpHelper;
    private Language language;

    public WebServiceDefinitionSearch(HttpHelper helper){
        this.httpHelper = helper;
    }

    private WebServiceDefinitionSearch(HttpHelper helper, Language language){
        this.httpHelper = helper;
        this.language = language;
    }

    public static WebServiceDefinitionSearch newInstance(){
        return new WebServiceDefinitionSearch(HttpHelper.newHelper(), Language.ENGLISH);
    }

    public static WebServiceDefinitionSearch newForeignLanguageInstance(Language language){
        return new WebServiceDefinitionSearch(HttpHelper.newHelper(), language);
    }


    @Override
    public List<String> getDefinition(String word) {
        String responseBody = httpHelper.sendGet(URI + word + "&lang=" + language);
        return extractDefinitions(responseBody);
    }
}
