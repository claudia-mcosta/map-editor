package org.academiadecodigo.heroisdoVAR;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class MapEditor {

    private int cols;
    private int rows;
    private Grid grid;
    private Cursor cursor;


    public MapEditor(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void init() {

        grid = new Grid(cols, rows);
        grid.draw();

        cursor = new Cursor(0, 0, Grid.CELL_SIZE);

    }
}
