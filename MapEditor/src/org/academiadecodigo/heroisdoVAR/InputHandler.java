package org.academiadecodigo.heroisdoVAR;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class InputHandler implements KeyboardHandler {

    private Cursor cursor;
    private Keyboard keyboard;
    private KeyboardEvent[] events;
    public InputHandler(Cursor cursor) {
        this.cursor = cursor;
        this.keyboard = new Keyboard(this);
        createEvents();
    }

    private void createEvents(){
        events = new KeyboardEvent[7];

        events[0].setKey(KeyboardEvent.KEY_UP);
        events[1].setKey(KeyboardEvent.KEY_RIGHT);
        events[2].setKey(KeyboardEvent.KEY_DOWN);
        events[3].setKey(KeyboardEvent.KEY_LEFT);
        events[4].setKey(KeyboardEvent.KEY_SPACE);
        events[5].setKey(KeyboardEvent.KEY_SPACE);
        events[6].setKey(KeyboardEvent.KEY_C);

        for(int i = 0; i < events.length - 1; i++) {
            events[i].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        }
        events[7].setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                break;
            case KeyboardEvent.KEY_RIGHT:
                break;
            case KeyboardEvent.KEY_DOWN:
                break;
            case KeyboardEvent.KEY_LEFT:
                break;
            case KeyboardEvent.KEY_SPACE:
                cursor.fill(Color.WHITE);
                break;
            case KeyboardEvent.KEY_C:
                // cursor.fill(ColorArray[]); Create color array;
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                cursor.fill(Color.BLACK);
                break;
            default:
                break;
        }
    }
}
