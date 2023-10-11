
public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{1, 23, 0, -4, -5}, {0, 56, -3, 4, 0}, {4, -78, 6, 12, 20}, {-8, 0, 0, 2, -67}, {1, 13, 54, 4, 10}};
        //int [][] matrix={{1,23,0,-4,-5}, {0,56,-3,4,0},{4,-78,6,12,20}, {-8,0,0,2,-67},{1,13,54,4,10}, {0,0,0,0,0}};

        Matrix matrixObj = new Matrix(matrix); //создаем обьект

        System.out.println("Исходная матрица");
        matrixObj.setPrintMatrix();
        Matrix clonMatrix=new Matrix(matrixObj);


        System.out.println("Task A");
        matrixObj.swapFirstAndLastColumn();

        System.out.println("Task B");
        matrixObj.createNewMatrixFromEvenRows();

        System.out.println("Task D");
        matrixObj.findMinimumElement(clonMatrix.getMatrix());

        String sentence = "I am Mary and I want to become a good programmer";
        Sentence sentenceObj = new Sentence(sentence);//создаем обьект

        System.out.println("Task C");
        sentenceObj.sortWordsByLength();

        System.out.println("Полученная матрица после выполнения заданий");
        matrixObj.setPrintMatrix();
        System.out.println("Исходная матрица");
        clonMatrix.setPrintMatrix();
    }
}