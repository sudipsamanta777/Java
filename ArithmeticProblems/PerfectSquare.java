package Java.ArithmeticProblems;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        while(num > 0){
            if((num % 2) == 0){
                return true;
            }
            num = num / 2;
        }
        return false;
    }

    public static void main(String[] args) {
//        Array implementation
        /*
        1.int score[][] = new int[2][];
        2. int score1[][] = new int[2][];
        score1[0] = new int[2];
        3. int[][] ar = new int[2][2];
        */
        int n = 14;
        System.out.println(isPerfectSquare(n));
    }
}
