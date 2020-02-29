package com.mulganov.project.libgdx.desktop;

import com.badlogic.gdx.Gdx;
import com.mulganov.project.libgdx.GE.GraphicElement;
import com.mulganov.project.libgdx.Init.Inits;
import com.mulganov.project.libgdx.Screens;
import com.mulganov.project.libgdx.desktop.Event.Events;
import com.mulganov.project.libgdx.desktop.Init.MenuInit;
import com.mulganov.project.libgdx.tools.Layuot;

import org.lwjgl.Sys;

public class Game extends com.badlogic.gdx.Game {

    public static Game game;

    @Override
    public void create() {
        game = this;

        Inits.Menu = new MenuInit();
        System.out.println("[Init] --> [Menu]");

        Screens.Menu.setInit(Inits.Menu);

        for(Layuot l: Inits.Menu.getLayuots()){
            for (GraphicElement ge: l.get()){
                System.out.println(ge.toString());
            }
        }

        setScreen(Screens.Menu);

        Gdx.input.setInputProcessor(Events.Menu);
    }
}
