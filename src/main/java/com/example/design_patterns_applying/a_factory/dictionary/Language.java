package com.example.design_patterns_applying.a_factory.dictionary;

public enum Language {

    ENGLISH("en"), SPANISH("es");

    private String language;

    Language(String language) {
        this.language = language;
    }

    @Override
    public String toString(){
        return language;
    }

}
