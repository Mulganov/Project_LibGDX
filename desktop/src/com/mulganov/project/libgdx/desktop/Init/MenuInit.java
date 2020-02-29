package com.mulganov.project.libgdx.desktop.Init;

import com.badlogic.gdx.Gdx;
import com.mulganov.project.libgdx.GE.ImageGrid;
import com.mulganov.project.libgdx.Init.Init;
import com.mulganov.project.libgdx.Init.Inits;
import com.mulganov.project.libgdx.Screens;
import com.mulganov.project.libgdx.desktop.Game;
import com.mulganov.project.libgdx.tools.Layuot;
import com.mulganov.project.libgdx.tools.Vector;

import org.lwjgl.Sys;

import java.util.ArrayList;

public class MenuInit extends Init {

    public MenuInit(){
        ArrayList<Layuot> layuots = new ArrayList<>();
        layuots.add(l0());

        super.setLayuots(layuots);
    }

    private Layuot l0(){
        Layuot l0 = new Layuot(0);

        Vector grid = new Vector(5, 3);

        ImageGrid maps_edition_mode = new ImageGrid("menu/maps_edition_mode.png");
        maps_edition_mode.setSize_window(grid);
        maps_edition_mode.setSize(new Vector(1, 1));
        maps_edition_mode.setPosition(new Vector(3, 1));

        maps_edition_mode.setClick(new Runnable() {
            @Override
            public void run() {
                System.out.println("events");
//                Game.game.setScreen(Screens.MapsEdition);
//
//                MapsEditionInputProcessor inputProcessor = new MapsEditionInputProcessor((MapsEdition) Screens.MapsEdition);
//                Gdx.input.setInputProcessor(inputProcessor);
            }
        });

        l0.add(maps_edition_mode);

        ImageGrid game_mode = new ImageGrid("menu/game_mode.png");
        game_mode.setSize_window(grid);
        game_mode.setSize(new Vector(1, 1));
        game_mode.setPosition(new Vector(1, 1));


        l0.add(game_mode);
        return l0;
    }
}
