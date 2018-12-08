package com.company;

public class ConcreteFlyweightChar implements FlyweightGlyph{
    private String character = "";

    public ConcreteFlyweightChar(String character){
        this.character = character;
    }
    @Override
    public void draw(String color, int x, int y) {
        System.out.println("I am the charctere : "+this.character+" I have a "+color+" color and i am in position : ("+x+","+y+")");
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
