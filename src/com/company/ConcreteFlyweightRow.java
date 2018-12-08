package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConcreteFlyweightRow implements FlyweightGlyph {
    private List<ConcreteFlyweightChar> content = new ArrayList<ConcreteFlyweightChar>();

    public ConcreteFlyweightRow(){

    }
    @Override
    public void draw(String color, int x, int y) {
        int i = 0;
        for(ConcreteFlyweightChar f:content){
            f.draw(color,x,y+i);
            i++;
        }
    }
    public void addCharacter(ConcreteFlyweightChar charctere){
        this.content.add(charctere);
    }
}
