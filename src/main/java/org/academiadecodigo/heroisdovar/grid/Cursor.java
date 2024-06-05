package org.academiadecodigo.heroisdovar.grid;

import org.academiadecodigo.heroisdovar.InputHandler;
import org.academiadecodigo.heroisdovar.MapEditor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Cursor extends Cell {

    private Ellipse tracker;

    public Cursor() {
        super(0, 0);

        new InputHandler(this);

        double trackerSize = Grid.CELL_SIZE / 1.5;
        this.tracker = new Ellipse(trackerSize, trackerSize, trackerSize, trackerSize);

        paint(Grid.COLORS.get(0));
    }

    @Override
    public void paint(Color color) {
        super.paint(color);
        if (tracker != null) {
            tracker.setColor(getColor() != Color.WHITE ? Color.WHITE : Color.BLACK);
            tracker.fill();
        }
    }

    public void move(int x, int y) {
        getRectangle().translate(x, y);
        tracker.translate(x, y);
    }

    public void changeColor() {

        int colorIndex = Grid.COLORS.indexOf(getColor()) + 1;

        if (colorIndex == Grid.COLORS.size()) {
            colorIndex = 0;
        }

        paint(Grid.COLORS.get(colorIndex));
    }
}