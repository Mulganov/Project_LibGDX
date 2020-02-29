package com.mulganov.project.libgdx.GE;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class GraphicElement {

    public void draw(SpriteBatch batch){
    }

    public void event(){

    }

    public void event(int x, int y, int p){

    }

    public String toString(){
        String text = "----------------------------\nClass: GraphicElement\n";

        return text;
    }
}
