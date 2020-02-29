package com.mulganov.project.libgdx.tools;

import com.mulganov.project.libgdx.GE.GraphicElement;

import java.util.ArrayList;

public class Layuot {

    private ArrayList<GraphicElement> list = new ArrayList<>();
    private int number;

    public Layuot(int number){
        this.number = number;
    }

    public void add(GraphicElement image){
        list.add(image);
    }

    public ArrayList<GraphicElement> get(){
        return list;
    }

    public GraphicElement get(int number){
        return list.get(number);
    }
}
