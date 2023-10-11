import java.util.Random;

public class Matrix {
    private int[][] matrix;
    public int[][] getMatrix() {
        return matrix;
    }
    private int rows;
    private int columns;
    public Matrix(int[][] matrix) {
        this.matrix = matrix;// присваивает переданный двумерный массив matrix полю matrix класса
        this.rows = matrix.length;//присваивает количество строк в переданном массиве matrix полю rows класса
        this.columns = matrix[0].length;//присваивает количество столбцов в первой строке переданного массива matrix полю columns класса.
    }
    public Matrix() { //конструктор по умолчанию заполняет матрицу рандомными числами
        this.rows=5;
        this.columns=5;
        Random rand=new Random();
        int[][] matrix2 = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j]=rand.nextInt(100);
            }
            System.out.println();
        }
        System.out.println();
        this.matrix=matrix2;
    }
    public Matrix(Matrix original){ //копирование матрицы
        rows=original.rows;
        columns=original.columns;
        matrix=new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j]=original.matrix[i][j];
            }
        }
        System.out.println("Матрица успешно клонирована");
        
    }
    public void setPrintMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void swapFirstAndLastColumn() {
        int temp;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] < matrix[i][columns - 1]) {
                temp = matrix[i][0];
                matrix[i][0] = matrix[i][columns - 1];
                matrix[i][columns - 1] = temp;
            }
        }
        setPrintMatrix();
    }
    public void createNewMatrixFromEvenRows() {
        int k = rows / 2;
        int[][] newMatrix = new int[k][columns];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < columns; j++) {
                newMatrix[i][j] = matrix[2 * i + 1][j]; // каждая 2-я строка исходной матрицы равна строке в новой матрице
            }
        }
        matrix = newMatrix; // сохраняем новую матрицу в поле класса
        rows = k;
        setPrintMatrix();
    }
    public void findMinimumElement(int [][]matrix2) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                if (matrix2[i][j] < min) {
                    min = matrix2[i][j];
                }
            }
        }
        System.out.println("Minimum element = " + min);
        System.out.println();
    }
}
