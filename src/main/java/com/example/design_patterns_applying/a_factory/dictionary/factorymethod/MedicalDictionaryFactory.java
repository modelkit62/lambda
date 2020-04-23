package com.example.design_patterns_applying.a_factory.dictionary.factorymethod;

import com.example.design_patterns_applying.a_factory.dictionary.Dictionary;
import com.example.design_patterns_applying.a_factory.dictionary.Language;
import com.example.design_patterns_applying.a_factory.dictionary.MedicalDictionary;
import com.example.design_patterns_applying.a_factory.search.DedicatedMedicalDefinitionSearch;

public class MedicalDictionaryFactory extends DictionaryFactory {

    @Override
    protected Dictionary create(Language language) {
        return new MedicalDictionary(new DedicatedMedicalDefinitionSearch(language));
    }
}
