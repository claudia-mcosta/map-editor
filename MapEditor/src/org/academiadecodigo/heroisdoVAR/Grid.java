package org.academiadecodigo.heroisdoVAR;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Grid {

    public final static int PADDING = 10;
    private int cellSize = 20;
    private int cols;
    private int rows;
    private GridCell[] cells;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void drawGrid() {

        int cellTotal = cols * rows;
        cells = new GridCell[cellTotal];

        for (GridCell c : cells) {
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    c = new GridCell(PADDING + (i * cellSize), PADDING + (j * cellSize), cellSize);
                    c.draw();
                }
            }
        }
    }

}
