import java.util.Scanner;

public class MatrixOperations {

    // Görev 1: Matris Çarpımı
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Görev 2: Determinant Hesaplama (3x3 Matris)
    public static int calculateDeterminant(int[][] matrix) {
        int determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[2][1] * matrix[1][2])
                        - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[2][0] * matrix[1][2])
                        + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[2][0] * matrix[1][1]);
        return determinant;
    }

    // Görev 3: Matris Tersini Bulma (2x2 Matris)
    public static double[][] inverseMatrix2x2(int[][] matrix) {
        int determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        if (determinant == 0) {
            System.out.println("Matrisin tersi yoktur.");
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }

    // Görev 4: Doğrusal Bağımsızlık Kontrolü (3 Vektör)
    public static boolean checkLinearIndependence(int[][] vectors) {
        int determinant = calculateDeterminant(vectors);
        return determinant != 0;
    }

    // Yardımcı Metot: Matris Yazdırma
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matris Çarpımı (3x3 Matris)
        System.out.println("Matris Çarpımı için 3x3 iki matris girin:");
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        System.out.println("Birinci matris:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("İkinci matris:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] product = multiplyMatrices(matrix1, matrix2);
        System.out.println("Matris Çarpımı Sonucu:");
        for (int[] row : product) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Determinant Hesaplama (3x3 Matris)
        System.out.println("3x3 bir matris girin (determinant hesaplama):");
        int[][] matrix3x3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3x3[i][j] = scanner.nextInt();
            }
        }
        int determinant = calculateDeterminant(matrix3x3);
        System.out.println("Determinant: " + determinant);

        // Matris Tersini Bulma (2x2 Matris)
        System.out.println("2x2 bir matris girin (tersini bulma):");
        int[][] matrix2x2 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2x2[i][j] = scanner.nextInt();
            }
        }
        double[][] inverse = inverseMatrix2x2(matrix2x2);
        if (inverse != null) {
            System.out.println("Matrisin Tersi:");
            printMatrix(inverse);
        }

        // Doğrusal Bağımsızlık Kontrolü (3 Vektör)
        System.out.println("3 tane 3 boyutlu vektör girin (doğrusal bağımsızlık kontrolü):");
        int[][] vectors = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vectors[i][j] = scanner.nextInt();
            }
        }
        boolean isIndependent = checkLinearIndependence(vectors);
        System.out.println("Vektörler doğrusal olarak " + (isIndependent ? "bağımsızdır." : "bağımlıdır."));
        
        scanner.close();
    }
}
