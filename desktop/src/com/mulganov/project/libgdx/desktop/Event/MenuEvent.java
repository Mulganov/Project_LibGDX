package com.mulganov.project.libgdx.desktop.Event;

import com.badlogic.gdx.InputProcessor;
import com.mulganov.project.libgdx.GE.GraphicElement;
import com.mulganov.project.libgdx.Screens;
import com.mulganov.project.libgdx.menu.Menu;
import com.mulganov.project.libgdx.tools.Layuot;

public class MenuEvent implements InputProcessor {

    @Override
    public boolean keyDown (int keycode) {
        
        return false;
    }

    @Override
    public boolean keyUp (int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped (char character) {
        return false;
    }

    @Override
    public boolean touchDown (int x, int y, int pointer, int button) {
       // System.out.println("touchDown");

        for (Layuot l: ((com.mulganov.project.libgdx.menu.Menu) Screens.Menu).getLayuots()){
            for (GraphicElement i: l.get()){
                i.event(x, y, pointer);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean touchUp (int x, int y, int pointer, int button) {
        //System.out.println("touchUp");
        return false;
    }

    @Override
    public boolean touchDragged (int x, int y, int pointer) {
        //System.out.println("touchDragged");
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
       // System.out.println("mouseMoved");
        return false;
    }


    @Override
    public boolean scrolled (int amount) {
        System.out.println("scrolled");
        return false;
    }
}