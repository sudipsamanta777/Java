package Java.Matrix;
 // Sum of two matrix and printing its all element as matrix shows..
public class MatrixPrac1 {
    public static void main(String[] args) {
        int[][] matrix1 ={
                {1, 2, 5, 6},
                {3, 4, 5, 3},
                {3, 2, 15, 3},
                {4, 3, 2, 16}

        };
        int[][] matrix2 = {
                {1, 2, 5, 6},
                {3, 4, 5, 3},
                {3, 2, 15,40},
                {4, 3, 2, 1}

        };
        int[][] NewMatrix = new int[matrix2.length][matrix2[0].length];

        for(int i =0; i< matrix1.length; i++){
            for(int j =0; j< matrix1[i].length; j++){
                NewMatrix[i][j] = matrix2[i][j]+matrix1[i][j];
                System.out.print(NewMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
