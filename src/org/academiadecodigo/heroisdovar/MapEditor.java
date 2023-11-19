package org.academiadecodigo.heroisdovar;

import org.academiadecodigo.heroisdovar.grid.Cursor;
import org.academiadecodigo.heroisdovar.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;

import java.util.Arrays;
import java.util.List;

public class MapEditor {

    private int cols;
    private int rows;
    private Grid grid;
    private Cursor cursor;
    public static List<Color> colors = Arrays.asList(
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.MAGENTA,
            Color.BLACK
    );

    public MapEditor(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void init() {

        grid = new Grid(cols, rows);
        cursor = new Cursor();

    }

    public static void main(String[] args) {

        MapEditor mapEditor = new MapEditor(30, 30);
        mapEditor.init();

    }
}
