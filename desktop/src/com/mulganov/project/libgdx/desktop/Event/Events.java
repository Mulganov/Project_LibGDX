package com.mulganov.project.libgdx.desktop.Event;

import com.badlogic.gdx.InputProcessor;

public class Events {

    public final static InputProcessor Menu;

    static {
        Menu = new MenuEvent();
    }
}
