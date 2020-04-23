package com.example.design_patterns_applying.a_factory.dictionary;

import com.example.design_patterns_applying.a_factory.search.DedicatedMedicalDefinitionSearch;
import com.example.design_patterns_applying.a_factory.search.DefinitionSearch;

import java.util.List;

public class MedicalDictionary implements Dictionary {

    DefinitionSearch search;

    public MedicalDictionary(DefinitionSearch search) {
        this.search = search;
    }

    public MedicalDictionary() {
        this.search = new DedicatedMedicalDefinitionSearch();
    }


    @Override
    public List<String> getDefinitions(String word) {
        return search.getDefinition(word);
    }
}
