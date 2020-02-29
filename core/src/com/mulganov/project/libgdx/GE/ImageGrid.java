package com.mulganov.project.libgdx.GE;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mulganov.project.libgdx.tools.Vector;

public class ImageGrid extends GraphicElement{

    private Sprite sprite;

    private Vector size;
    private Vector size_window;
    private Vector position;

    private Runnable click;
    private boolean clickB = false;

    private boolean draw = true;

    public ImageGrid(String url){
        sprite = new Sprite(new Texture(url));
    }

    public void setSize(Vector x){
        this.size = x;
    }
    public void setSize_window(Vector x){
        this.size_window = x;
    }
    public void setPosition(Vector x){
        this.position = x;
    }

    public Vector getPosition(){
        return position;
    }
    public Vector getSize(){
        return size;
    }
    public Vector getSize_window(){
        return size_window;
    }


    @Override
    public void draw(SpriteBatch batch){
        int x, y;

        int ww, hh;

        ww = (int) (Gdx.graphics.getWidth() /
                size_window.X);
        hh = (int) (Gdx.graphics.getHeight() /
                size_window.Y);

        x = (int) (ww * position.X);
        y = (int) (hh * position.Y);

        int w, h;

        w = (int) (ww * size.X);
        h = (int) (hh * size.Y);

        batch.begin();

        batch.draw(sprite, x, y, w, h);

        batch.end();
    }

    public void setClick(Runnable runnable){
        this.click = runnable;
        this.clickB = true;
    }

    @Override
    public void event(){
        if (!clickB) return;
        click.run();
    }

    public boolean getClickB(){
        return clickB;
    }

    public void setDraw(boolean draw){
        this.draw = draw;
    }
    public boolean getDraw(){
        return draw;
    }

    @Override
    public void event(int x, int y, int p){

        int xx, yy;

        int ww, hh;

        ww = (int) (Gdx.graphics.getWidth() / size_window.X);
        hh = (int) (Gdx.graphics.getHeight() / size_window.Y);

        xx = (int) (ww * position.X);
        yy = (int) (hh * position.Y);

        int w, h;

        w = (int) (ww * size.X);
        h = (int) (hh * size.Y);

        if ( xx <= x && x<= xx + w ){
            if ( yy <= y && y<= yy + h ){
                event();
            }
        }

    }

    @Override
    public String toString(){
        String text = super.toString();

        text += "Name: ImageGrid";

        return text;
    }
}
