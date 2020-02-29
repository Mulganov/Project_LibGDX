package com.mulganov.project.libgdx.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mulganov.project.libgdx.GE.GraphicElement;
import com.mulganov.project.libgdx.Init.Init;
import com.mulganov.project.libgdx.tools.Layuot;
import com.mulganov.project.libgdx.tools.Vector;

import java.awt.Image;
import java.util.ArrayList;

public class Menu implements Screen {

    SpriteBatch batch;
    private Image maps_edition_mode, game_mode;

    private Vector grid;

    private ArrayList<Layuot> layuots = null;

    public Menu(){
        this.batch = new SpriteBatch();
    }

    public ArrayList<Layuot> getLayuots(){
        return layuots;
    }

    public void setLayuots(ArrayList<Layuot> l){
        this.layuots = l;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        if (layuots == null) return;

        Gdx.gl.glClearColor(1, 1, 1, 1);// Очищаем экран
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        for (Layuot l: layuots){
            for (GraphicElement ge: l.get()){
                ge.draw(batch);
            }
        }
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    public void setInit(Init menu) {
        this.layuots = menu.getLayuots();
    }
}
