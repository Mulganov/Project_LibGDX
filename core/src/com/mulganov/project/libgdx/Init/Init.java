package com.mulganov.project.libgdx.Init;

import com.mulganov.project.libgdx.tools.Layuot;

import java.util.ArrayList;

public class Init {

    private ArrayList<Layuot> layuots = new ArrayList<>();

    public void setLayuots(ArrayList<Layuot> l){
        this.layuots = l;
    }

    public ArrayList<Layuot> getLayuots(){
        return layuots;
    }
}
