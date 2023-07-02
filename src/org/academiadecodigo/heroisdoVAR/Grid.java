package org.academiadecodigo.heroisdoVAR;

import org.academiadecodigo.simplegraphics.graphics.Color;

import java.io.*;

public class Grid {

    public final static int PADDING = 10;
    public final static int CELL_SIZE = 20;
    public static int cols;
    public static int rows;
    public static GridCell[][] cells;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void draw() {

        cells = new GridCell[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cells[i][j] = new GridCell(i * CELL_SIZE, j * CELL_SIZE, CELL_SIZE);
            }
        }
    }

    public static void save() {

        String string = "";

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                string += ColorPalette.colors[cells[i][j].getColorIndex()] != Color.WHITE ? cells[i][j].getColorIndex() : 0; // Use color index
            }
            string += "\n";
        }

        try {

            FileWriter writer = new FileWriter("/Users/codecadet/Desktop/Java/MapEditor/src/org/academiadecodigo/heroisdoVAR/DestinationFile.txt");
            BufferedWriter bWriter = new BufferedWriter(writer);

            bWriter.write(string);

            bWriter.flush();
            bWriter.close();

        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }

    public static void load() {

        try {
            FileReader reader = new FileReader("/Users/codecadet/Desktop/Java/MapEditor/src/org/academiadecodigo/heroisdoVAR/DestinationFile.txt");
            BufferedReader bReader = new BufferedReader(reader);

            String line = "";

            for (int i = 0; i < cols; i++) {
                line = bReader.readLine();
                for (int j = 0; j < rows; j++) {
                    if (line.charAt(j) != '0') {
                        cells[i][j].fill(); // Use color index
                    }
                }
            }

            bReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }

    public void clear() {
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cells[i][j].fill(cells[i][j].getColor() != Color.WHITE ? Color.WHITE : Color.RED);
            }
        }
    }
}
