package com.example.design_patterns_applying.a_factory;

import com.example.design_patterns_applying.a_factory.dictionary.Dictionary;
import com.example.design_patterns_applying.a_factory.dictionary.GeneralDictionary;
import com.example.design_patterns_applying.a_factory.dictionary.SimpleDictionaryFactory;

import java.util.List;

import static com.example.design_patterns_applying.a_factory.dictionary.DictionaryType.MEDICAL;
import static com.example.design_patterns_applying.a_factory.dictionary.Language.ENGLISH;

public class AppWithSimpleFactory {

    public static void main(String[] args){

        System.out.println("Dict with static factory methods");
        // Dict with several static factory methods
        GeneralDictionary dict1 = GeneralDictionary.english();
        List<String> definitions1 = dict1.getDefinitions("tea");
        definitions1.forEach(System.out::println);

        GeneralDictionary dict2 = GeneralDictionary.spanish();
        List<String> definitions2 = dict2.getDefinitions("hola");
        definitions2.forEach(System.out::println);



        // Dict with several static factory methods
        GeneralDictionary dict3 = SimpleDictionaryFactory.english();
        GeneralDictionary dict4 = SimpleDictionaryFactory.ofLanguage(ENGLISH);
        Dictionary dict5 = SimpleDictionaryFactory.ofType(MEDICAL);

        dict3.getDefinitions("keyboard")
                .forEach(System.out::println);

        dict4.getDefinitions("keyboard")
                .forEach(System.out::println);

        dict5.getDefinitions("doctor")
                .forEach(System.out::println);
    }
}
