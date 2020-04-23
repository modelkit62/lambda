package com.example.design_patterns_applying.a_factory.dictionary.factorymethod;

import com.example.design_patterns_applying.a_factory.dictionary.Dictionary;
import com.example.design_patterns_applying.a_factory.dictionary.GeneralDictionary;
import com.example.design_patterns_applying.a_factory.dictionary.Language;

import static com.example.design_patterns_applying.a_factory.search.WebServiceDefinitionSearch.newForeignLanguageInstance;

public class GeneralDictionaryFactory extends DictionaryFactory {

    @Override
    Dictionary create(Language language) {
        return new GeneralDictionary(newForeignLanguageInstance(language));
    }
}
