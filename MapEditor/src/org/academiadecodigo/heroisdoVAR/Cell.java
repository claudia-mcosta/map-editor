package org.academiadecodigo.heroisdoVAR;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

abstract public class Cell {

    private Rectangle rectangle;
    private Color color;

    public Cell(int x, int y, int size) {
        this.color = Color.WHITE;
        this.rectangle = new Rectangle(x, y, size, size);
    }

    public Color getColor() {
        return color;
    }

    public void fill(Color color) {
        this.color = color;
        rectangle.setColor(color);
        rectangle.fill();
    }

    public void empty() {
        this.color = Color.WHITE;
    }

    public void draw() {
        rectangle.draw();
    }

    public int getX() {
        return rectangle.getX();
    }

    public int getY() {
        return rectangle.getY();
    }

}

