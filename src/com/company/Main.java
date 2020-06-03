package com.company;

import static java.util.Locale.ENGLISH;

public class Main {

    public static void main(String[] args) {
        ISpeaker iSpeaker = SpeakFactory.CreateSpeaker(Language.ENGLISH);
        iSpeaker.speak();
    }
}
