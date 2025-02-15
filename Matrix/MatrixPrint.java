package Java.Matrix;

public class MatrixPrint {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2,5,6,7},
                {3, 4,5,3},
                {3,2,15},
                {4,3,2,1,6}

        };
        int sum = 0;
        for(int i =0; i<matrix.length; i++){
            sum=0;
            for(int j =0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
                sum += matrix[i][j];
            }
            System.out.println();
            System.out.println("Row"+i+" Sum : "+sum);
        }

    }
}
