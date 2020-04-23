package com.example.design_patterns_applying.a_factory;

import com.example.design_patterns_applying.a_factory.dictionary.factorymethod.DictionaryFactory;
import com.example.design_patterns_applying.a_factory.dictionary.factorymethod.GeneralDictionaryFactory;

import static com.example.design_patterns_applying.a_factory.dictionary.Language.ENGLISH;

public class AppWithFactoryMethod {

    public static void main(String[] args){

        DictionaryFactory dictionaryFactory = new GeneralDictionaryFactory();

        dictionaryFactory.newDictionary(ENGLISH)
                .getDefinitions("coffee")
                .forEach(System.out::println);
    }
}
