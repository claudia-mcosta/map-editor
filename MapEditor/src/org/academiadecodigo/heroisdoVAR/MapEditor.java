package org.academiadecodigo.heroisdoVAR;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class MapEditor {

    private int cols;
    private int rows;
    private int cellSize = 20;
    private Grid grid;
    private Cursor cursor;
    private InputHandler inputHandler;

    public MapEditor(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void init() {

        grid = new Grid(cols, rows);
        grid.drawGrid();

        cursor = new Cursor(Grid.PADDING, Grid.PADDING, cellSize);
        cursor.fill(Color.CYAN);

        inputHandler = new InputHandler(cursor);

    }

    public void start() {

    }
}
