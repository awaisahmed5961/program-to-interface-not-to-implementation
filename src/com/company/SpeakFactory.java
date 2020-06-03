package com.company;

import javax.management.InvalidApplicationException;

public class SpeakFactory {
    public  static  ISpeaker CreateSpeaker(Language language){
        switch (language){
            case ENGLISH:
                return new EnglishSpeaker();
            case GERMAN:
                return new GermanSpeaker();
            case SPANISH:
                return new SpanishSpeaker();
            default:
                return null;
        }
    }
}
