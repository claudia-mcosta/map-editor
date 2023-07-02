package org.academiadecodigo.heroisdoVAR;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Colorable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

abstract public class Cell {

    protected Rectangle rectangle;
    Color color;

    public Cell(int x, int y, int size) {
        this.rectangle = new Rectangle(Grid.PADDING + x,Grid.PADDING + y, size, size);
        this.color = Color.WHITE;
        fill(color);
    }

    public Color getColor() {
        return color;
    }

    public void fill() {
        rectangle.fill();
    }

    public void fill(Color color) {
        this.color = color;
        rectangle.setColor(color);
        rectangle.fill();
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

