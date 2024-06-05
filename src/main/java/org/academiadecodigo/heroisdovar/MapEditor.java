package org.academiadecodigo.heroisdovar;

import org.academiadecodigo.heroisdovar.grid.Cursor;
import org.academiadecodigo.heroisdovar.grid.Grid;

public class MapEditor {

    private int cols;
    private int rows;

    public MapEditor(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void init() {

        new Grid(cols, rows);
        new Cursor();
    }

    public static void main(String[] args) {

        MapEditor mapEditor = new MapEditor(30, 30);
        mapEditor.init();
    }
}
