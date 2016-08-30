package com.example.abdel.mygame;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

/**
 * Created by abdel on 30/08/16.
 */
public class GameView extends GLSurfaceView {

    private GameRenderer gameRenderer;

    public GameView (Context context) {
        super(context);
        setEGLContextClientVersion(2);
        gameRenderer = new GameRenderer(context);
        setRenderer(gameRenderer);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {

        float x = e.getX();
        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:


                if (x < getWidth() / 2) {
                    gameRenderer.setHeroMove(gameRenderer.getHeroMove() + .1f);
                }

                if (x > getWidth() /2){
                    gameRenderer.setHeroMove(gameRenderer.getHeroMove() - .1f );

                }


        }

        return true;
    }

}
