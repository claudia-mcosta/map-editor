package org.academiadecodigo.heroisdovar.grid;

import org.academiadecodigo.heroisdovar.InputHandler;
import org.academiadecodigo.heroisdovar.MapEditor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Cursor extends Cell {

    private Ellipse tracker;
    private InputHandler inputHandler;

    public Cursor() {
        super(0, 0);
        this.inputHandler = new InputHandler(this);

        double trackerSize = Grid.CELL_SIZE / 1.5;
        this.tracker = new Ellipse(trackerSize, trackerSize, trackerSize, trackerSize);

        paint(MapEditor.colors.get(0));
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

        int colorIndex = MapEditor.colors.indexOf(getColor()) + 1;

        if (colorIndex == MapEditor.colors.size()) {
            colorIndex = 0;
        }

        paint(MapEditor.colors.get(colorIndex));
    }
}