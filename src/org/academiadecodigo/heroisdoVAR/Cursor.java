package org.academiadecodigo.heroisdoVAR;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Cursor extends Cell {

    private Ellipse tracker;
    private InputHandler inputHandler;

    public Cursor(int x, int y, int size) {
        super(x, y, size);
        this.tracker = new Ellipse(x + (size / 1.5), y + (size / 1.5), size / 1.5, size / 1.5);
        this.color = 0;
        fill(ColorPalette.colors[colorIndex]);

        inputHandler = new InputHandler(this);
    }

    @Override
    public void fill() {
        super.fill();
        tracker.fill();
    }

    @Override
    public void fill(Color color) {
        super.fill(color);
        if (tracker != null) {
            tracker.setColor(getColor() != Color.WHITE ? Color.WHITE : Color.BLACK);
            tracker.fill();
        }
    }

    public void translate(int x, int y) {
        rectangle.translate(x, y);
        tracker.translate(x, y);
    }

    public void changeColor() {

        colorIndex++;

        if (colorIndex == ColorPalette.colors.length) {
            colorIndex = 0;
        }

        fill(ColorPalette.colors[colorIndex]);
    }
}
