import serial.MatrixGenerator;
import ver2.ParallelRowMultiplier;
import ver3.ParallelGroupMultiplier;

import java.util.Date;

public class Driver {
    //
    public static void main(String[] args) {
        //
        double[][] matrix1 = MatrixGenerator.generate(2000, 2000);
        double[][] matrix2 = MatrixGenerator.generate(2000, 2000);

        double[][] result = new double[matrix1.length][matrix2[0].length];

        Date start = new Date();
        ParallelGroupMultiplier.multiply(matrix1, matrix2, result);
        Date end = new Date();
        System.out.printf("Serial: %d%n", end.getTime() - start.getTime());

    }
}
