package org.academiadecodigo.heroisdovar.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

abstract public class Cell {

    private final Rectangle rectangle;
    private Color color;

    public Cell(int x, int y) {
        this.rectangle = new Rectangle(Grid.PADDING + (x * Grid.CELL_SIZE),Grid.PADDING + (y * Grid.CELL_SIZE), Grid.CELL_SIZE, Grid.CELL_SIZE);
        paint(Color.WHITE);
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return rectangle.getX();
    }

    public int getY() {
        return rectangle.getY();
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void paint(Color color) {
        this.color = color;
        rectangle.setColor(color);
        rectangle.fill();
    }
}