package org.academiadecodigo.heroisdovar;

import org.academiadecodigo.heroisdovar.grid.Cursor;
import org.academiadecodigo.heroisdovar.grid.Grid;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class InputHandler implements KeyboardHandler {

    private Cursor cursor;
    private Keyboard keyboard;
    private KeyboardEvent[] events;
    private boolean spacePressed;

    public InputHandler(Cursor cursor) {
        this.cursor = cursor;
        this.keyboard = new Keyboard(this);
        createEvents();
    }

    private void createEvents(){
        events = new KeyboardEvent[11];

        for(int i = 0; i < events.length; i++) {
            events[i] = new KeyboardEvent();
        }

        events[0].setKey(KeyboardEvent.KEY_UP);
        events[1].setKey(KeyboardEvent.KEY_RIGHT);
        events[2].setKey(KeyboardEvent.KEY_DOWN);
        events[3].setKey(KeyboardEvent.KEY_LEFT);
        events[4].setKey(KeyboardEvent.KEY_SPACE);
        events[5].setKey(KeyboardEvent.KEY_C);
        events[6].setKey(KeyboardEvent.KEY_L);
        events[7].setKey(KeyboardEvent.KEY_S);
        events[8].setKey(KeyboardEvent.KEY_R);
        events[9].setKey(KeyboardEvent.KEY_ESC);
        events[10].setKey(KeyboardEvent.KEY_SPACE);

        for(int i = 0; i < events.length - 1; i++) {
            events[i].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(events[i]);
        }
        events[10].setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(events[10]);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        int cursorCol = cursor.getX() / Grid.CELL_SIZE;
        int cursorRow = cursor.getY() / Grid.CELL_SIZE;

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_UP:

                if (cursor.getY() == Grid.PADDING)
                    break;

                if (spacePressed) {
                    Grid.cells[cursorCol][cursorRow].erase();
                } else {
                    Grid.cells[cursorCol][cursorRow].paint(cursor.getColor());
                }

                cursor.move(0, -Grid.CELL_SIZE);
                break;

            case KeyboardEvent.KEY_RIGHT:

                if (cursor.getX() == Grid.cells[Grid.cols - 1][0].getX())
                    break;

                if (spacePressed) {
                    Grid.cells[cursorCol][cursorRow].erase();
                } else {
                    Grid.cells[cursorCol][cursorRow].paint(cursor.getColor());
                }

                cursor.move(Grid.CELL_SIZE, 0);
                break;

            case KeyboardEvent.KEY_DOWN:

                if (cursor.getY() == Grid.cells[0][Grid.rows - 1].getY())
                    break;

                if (spacePressed) {
                    Grid.cells[cursorCol][cursorRow].erase();
                } else {
                    Grid.cells[cursorCol][cursorRow].paint(cursor.getColor());
                }

                cursor.move(0, Grid.CELL_SIZE);
                break;

            case KeyboardEvent.KEY_LEFT:

                if (cursor.getX() == Grid.PADDING)
                    break;

                if (spacePressed) {
                    Grid.cells[cursorCol][cursorRow].erase();
                } else {
                    Grid.cells[cursorCol][cursorRow].paint(cursor.getColor());
                }

                cursor.move(-Grid.CELL_SIZE, 0);
                break;

            case KeyboardEvent.KEY_SPACE:
                spacePressed = true;
                break;
            case KeyboardEvent.KEY_C:
                cursor.changeColor();
                break;
            case KeyboardEvent.KEY_L:
                FileManager.load();
                break;
            case KeyboardEvent.KEY_S:
                FileManager.save();
                break;
            case KeyboardEvent.KEY_R:
                Grid.clear();
                break;
            case KeyboardEvent.KEY_ESC:
                System.exit(1);
                break;
            default:
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE)
            spacePressed = false;

    }
}
