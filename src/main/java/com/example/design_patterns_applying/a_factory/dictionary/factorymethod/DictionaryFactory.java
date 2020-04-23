package com.example.design_patterns_applying.a_factory.dictionary.factorymethod;

import com.example.design_patterns_applying.a_factory.dictionary.Dictionary;
import com.example.design_patterns_applying.a_factory.dictionary.Language;

public abstract class DictionaryFactory {

    public Dictionary newDictionary(Language language){

        // perhaps some common steps before creation
        Dictionary d = create(language);
        // perhaps some common steps after creation
        return d;
    }

    abstract Dictionary create(Language language);
}
