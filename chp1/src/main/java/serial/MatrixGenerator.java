package serial;

import java.util.Random;

public class MatrixGenerator {
    //
    public static double[][] generate(int rows, int columns) {
        double[][] retValue = new double[rows][columns];

        Random random = new Random();
        for (int row=0; row<rows; row++) {
            for (int column=0; column<columns; column++) {
                retValue[row][column] = random.nextDouble() * 10;
            }
        }
        return retValue;
    }
}
