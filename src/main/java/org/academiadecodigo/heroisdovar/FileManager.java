package org.academiadecodigo.heroisdovar;

import org.academiadecodigo.heroisdovar.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;

import java.io.*;

public class FileManager {

    private static final String filePath = "src/main/resources/destination-file.txt";
    public static void save() {

        StringBuilder string = new StringBuilder();

        for (int row = 0; row < Grid.rows; row++) {
            for (int col = 0; col < Grid.cols; col++) {

                Color cellColor = Grid.cells[row][col].getColor();
                string.append(cellColor == Color.WHITE ? 0 : Grid.COLORS.indexOf(cellColor) + 1);
            }
            string.append("\n");
        }

        try {

            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bWriter = new BufferedWriter(writer);

            bWriter.write(string.toString());

            bWriter.flush();
            bWriter.close();

        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }

    public static void load() {

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bReader = new BufferedReader(reader);

            String line = "";
            Color color;
            int colorIndex;

            for (int row = 0; row < Grid.rows; row++) {

                line = bReader.readLine();

                for (int col = 0; col < Grid.cols; col++) {

                    colorIndex = Character.getNumericValue(line.charAt(col));
                    color = Color.WHITE;

                    if (colorIndex != 0)
                        color = Grid.COLORS.get(colorIndex - 1);

                    Grid.cells[row][col].paint(color);
                }
            }

            bReader.close();

        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}
