package Java.Array;

public class Arr1 {
    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5};
////        int[] b = new int [a.length];
//        for(int j = 0, i =a.length-1; i>= 0; i--){
////            b[j] = a[i];
//            System.out.print(a[i]);
////            j++;
//        }

        int m = 12;
        if(m==2){
            m = 12-2;
        }else if(m==1){
            m = 11-2;
        }else{
            m = m-2;
        }
        System.out.println(m);
        int k = 25;
        int d = (2059%1000)%100;
        System.out.println(d);
        int c = 2059/100;
        System.out.println(c);
        String s = "Sunday";

        int f = k+((13*m-1)/5)+d+(d/4)+(c/4)-(2*c);
        System.out.println(f);
       while(f>6){
           f=f%7;
       }
       if(f<0){
           f = f+(7*2);
       }
        System.out.println(f);
        switch(f){
            case 0:
                s = "Sunday";
                break;
            case 1:
                s = "Monday";
                break;
            case 2:
                s = "Tuesday";
                break;
            case 3:
                s = "Wednesday";
                break;
            case 4:
                s= "Thursday";
                break;
            case 5:
                s = "Friday";
                break;
            case 6:
                s= "Sturday";
                break;


        }
        System.out.println(s.toUpperCase());

    }
}
