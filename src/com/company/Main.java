package com.company;

public class Main {

    public static void main(String[] args) {
	    FlyweightGlyph a1 = FactoryFlyweight.createCharctere("a");
	    a1.draw("red",0,0);
	    FlyweightGlyph a2 = FactoryFlyweight.createCharctere("a");
	    a2.draw("yellow",1,1);
	    System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        ConcreteFlyweightRow row = new ConcreteFlyweightRow();
		 row.addCharacter((ConcreteFlyweightChar) a1);
		FlyweightGlyph s = FactoryFlyweight.createCharctere("s");
		FlyweightGlyph m = FactoryFlyweight.createCharctere("m");
		row.addCharacter((ConcreteFlyweightChar) s);
		row.addCharacter((ConcreteFlyweightChar) m);
		row.addCharacter((ConcreteFlyweightChar) a2);
		row.draw("red",0,0);
    }
}
