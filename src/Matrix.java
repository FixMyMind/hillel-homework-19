import java.util.Arrays;

public class Matrix {
    public static final int MATRIX_ELEMENTS = 8;

    public static void main(String[] args) {
        int[][] matrixArray = new int[MATRIX_ELEMENTS][MATRIX_ELEMENTS];
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if (i % 2 != 0) {
                    matrixArray[i][j] = j + 1;
                } else {
                    matrixArray[i][j] = MATRIX_ELEMENTS - j;
                }
            }
            System.out.println(Arrays.toString(matrixArray[i]));
        }
    }
}
