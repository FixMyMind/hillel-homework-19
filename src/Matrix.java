import java.util.Arrays;

public class Matrix {
    public static final int MATRIX_ELEMENTS = 8;

    public static void main(String[] args) {
        int index = 0;
        int[][] matrixArray = new int[MATRIX_ELEMENTS][MATRIX_ELEMENTS];
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                while (index < 8) {
                    matrixArray[j][index] = index + 1;
                    index++;
                }
                index = 0;
                if (i % 2 != 0) {
                    for (int k = 0; k < matrixArray[i].length / 2; k++) {
                        int temp = matrixArray[i][k];
                        matrixArray[i][k] = matrixArray[i][matrixArray.length - 1 - k];
                        matrixArray[i][matrixArray.length - 1 - k] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(matrixArray[i]));
        }
    }
}
