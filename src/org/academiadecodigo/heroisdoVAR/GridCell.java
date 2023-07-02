package org.academiadecodigo.heroisdoVAR;

import org.academiadecodigo.simplegraphics.graphics.Color;

import java.util.Iterator;

public class GridCell extends Cell {

    private boolean full;
    public GridCell(int x, int y, int size) {
        super(x, y, size);
    }

    public void empty() {
        fill(Color.WHITE);
        full = false;
    }

    public void fill(Color color) {
        super.fill(color);
        full = true;
    }

    public boolean isFull() {
        return full;
    }
}