package org.academiadecodigo.heroisdovar.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class GridCell extends Cell {

    public GridCell(int x, int y) {
        super(x, y);
    }

    public void erase() {
        paint(Color.WHITE);
    }
}