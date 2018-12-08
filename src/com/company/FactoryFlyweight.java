package com.company;


import java.util.HashMap;
import java.util.Map;

public final class FactoryFlyweight {
    private static  Map<String,FlyweightGlyph> charctereMap = new HashMap<>();

    private FactoryFlyweight(){
        throw new AssertionError("Cannot instantiate the class");
    }

    public static synchronized FlyweightGlyph createCharctere(String charctere){
        FlyweightGlyph glyph = charctereMap.get(charctere);
        if(glyph==null){
            glyph = new ConcreteFlyweightChar(charctere);
            charctereMap.put(charctere, glyph);
        }
        return glyph;
    }

}
