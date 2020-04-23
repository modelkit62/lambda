package com.example.design_patterns_applying.a_factory.search;

import com.example.design_patterns_applying.a_factory.dictionary.Language;

import java.util.List;

public class DedicatedMedicalDefinitionSearch implements DefinitionSearch {

    private Language language;

    public DedicatedMedicalDefinitionSearch(){
        this.language = Language.ENGLISH; // default
    }

    public DedicatedMedicalDefinitionSearch(Language language) {
        this.language = language;
    }

    @Override
    public List<String> getDefinition(String word) {
        return List.of("Perhaps from a database");
    }
}
