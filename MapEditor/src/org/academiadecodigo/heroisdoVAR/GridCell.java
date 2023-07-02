package org.academiadecodigo.heroisdoVAR;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class GridCell extends Cell {

    private boolean full;

    public GridCell(int x, int y, int size) {
        super(x, y, size);
        this.full = false;
    }

    public boolean isFull() {
        return full;
    }

    public void empty() {
        fill(Color.WHITE);
        this.full = false;
    }

    public void fill(Color color) {
        super.fill(color);
        this.full = true;
    }
}