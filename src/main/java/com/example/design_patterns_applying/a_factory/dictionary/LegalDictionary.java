package com.example.design_patterns_applying.a_factory.dictionary;

import com.example.design_patterns_applying.a_factory.search.DedicatedLegalDefinitionSearch;
import com.example.design_patterns_applying.a_factory.search.DefinitionSearch;

import java.util.List;

public class LegalDictionary implements Dictionary {

    DefinitionSearch search;

    public LegalDictionary(DefinitionSearch search) {
        this.search = search;
    }

    public LegalDictionary() {
        this.search = new DedicatedLegalDefinitionSearch();
    }

    @Override
    public List<String> getDefinitions(String word) {
        return search.getDefinition(word);
    }
}
