package com.example.design_patterns_applying.a_factory.dictionary.factorymethod;

import com.example.design_patterns_applying.a_factory.dictionary.Dictionary;
import com.example.design_patterns_applying.a_factory.dictionary.Language;
import com.example.design_patterns_applying.a_factory.dictionary.LegalDictionary;
import com.example.design_patterns_applying.a_factory.search.DedicatedLegalDefinitionSearch;

public class LegalDictionaryFactory extends DictionaryFactory {

    @Override
    protected Dictionary create(Language language) {
        return new LegalDictionary(new DedicatedLegalDefinitionSearch(language));
    }
}
