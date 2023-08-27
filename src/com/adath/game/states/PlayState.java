package com.adath.game.states;

import com.adath.game.util.KeyHandler;
import com.adath.game.util.MouseHandler;

import java.awt.*;

public class PlayState extends GameState {
    public PlayState(GameStateManager gsm) {
        super(gsm);
    }

    public void update(){

    }
    public void input(MouseHandler mouse, KeyHandler key) {

    }
    public void render(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(0,0,64,64);
    }

}
