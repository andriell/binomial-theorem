package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Андрей on 24.01.2016.
 */
public class DrawPanel extends JPanel {
    Binom binom;

    public Binom getBinom() {
        return binom;
    }

    public void setBinom(Binom binom) {
        this.binom = binom;
    }

    @Override
    protected void paintComponent(Graphics g) {
        int[][] ints = binom.getInts();
        int size = binom.getSize();
        int tab;
        for (int i = 0; i < ints.length; i++) {
            tab = (size - i) / 2;
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] != 0) {
                    g.drawRect(j + tab, i , 1, 1);
                }
            }
        }
    }
}
