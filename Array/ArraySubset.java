package Java.Array;

public class ArraySubset {
    public static void main(String[] args) {
        int[] a1 ={1, 2, 3, 4, 5, 1, 1, 1};
        int[] a2 ={1, 2, 3, 1};

        int n = a1.length;
        int m = a2.length;
        int count = 0;
        for(int i : a2){
            for(int j : a1){
                if(i == j){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println( "No");
    }
}
