package org.academiadecodigo.heroisdoVAR;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor extends Cell {

    private Ellipse border;

    public Cursor(int x, int y, int size) {
        super(x, y, size);
        this.border = new Ellipse(0, 0, size / 2, size / 2);
        border.setColor(Color.BLACK);
        border.fill();
    }

}
