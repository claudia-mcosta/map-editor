package org.academiadecodigo.heroisdovar.grid;

public class Grid {

    public final static int PADDING = 10;
    public final static int CELL_SIZE = 20;
    public static int cols;
    public static int rows;
    public static GridCell[][] cells;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;

        cells = new GridCell[cols][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col] = new GridCell(row, col);
            }
        }
    }

    public static void clear() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col].erase();
            }
        }
    }
}
