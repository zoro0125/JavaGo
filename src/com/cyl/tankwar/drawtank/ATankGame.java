package com.cyl.tankwar.drawtank;

import javax.swing.*;

/**
 * @author cyl
 * @version 1.0
 */

public class ATankGame extends JFrame {

    private MyPanel mp = null;
    public static void main(String[] args) {
        new ATankGame();
    }

    public ATankGame() {
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1000, 1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
