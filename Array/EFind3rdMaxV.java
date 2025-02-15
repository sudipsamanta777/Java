package Java.Array;

/*
  Find the 2nd  and 3rd max element from this array..
 */
public class EFind3rdMaxV {
    public static void main(String[] args) {
        int [] a= {5,5,5};
        int max = Integer.MIN_VALUE;
        int semax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;
        for(int i : a){
            if(i >= max){
                tmax = semax;
                semax = max;
                max = i;
            } else if (i >= semax && i != max) {
                tmax = semax;
                semax = i;
            }else if(i >= tmax && i != semax && i != tmax){
                tmax = i;
            }

        }
        System.out.println(tmax);
        System.out.println(semax);
        System.out.println(max);

    }
}
