package com.adath.game;

import javax.swing.*;

public class Window extends JFrame {
    public Window() {
        setTitle("Your mom");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new GamePanel(1380,720));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
