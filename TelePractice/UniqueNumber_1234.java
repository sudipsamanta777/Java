package Java.TelePractice;

public class UniqueNumber_1234 {
    public static void createUniqueNum(int init, int last){
        int count = 0;
        for(int i = init; i <= last; i++){
            for(int j = init; j <= last; j++){
                for(int k = init; k <= last; k++){
                    if(i != j && j!= k && i!=k){
                        System.out.print((i*100+j*10+k)+" ");
                        count++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Total Unique number is : "+ count);
    }

    public static void main(String[] args) {
        createUniqueNum(1,4 );
    }
}
