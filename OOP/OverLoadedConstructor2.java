package Java.OOP;

public class OverLoadedConstructor2 {
    public static void main(String[] args) {
        TestClass1 obj1 = new TestClass1();
        TestClass1 obj2 = new TestClass1(100);
        TestClass1 obj3 = new TestClass1(33.7);
        TestClass1 obj4 = new TestClass1("Sudip", '!');
        TestClass1 obj5 = new TestClass1("Sudip Samanta", '$', 50.5, 777);
        obj1.ShowDetails();
        obj2.ShowDetails();
        obj3.ShowDetails();
        obj4.ShowDetails();
        obj5.ShowDetails();
    }
}
class TestClass1{
    // data members or fields

    int x;
    String abc;
    char c;
    double y;

    TestClass1(){
        // default constructor / non-parameterized constructor
        this(12);
        //this(12.30);  // Only one explicit constructor call allowed in constructor
        System.out.println("data members are initialized by default value ");

    }
    TestClass1(int a){
        this(80.9);//parameterized constructor
        x = a;
    }
    TestClass1(double c){
        y = c;
    }
    TestClass1(String x, char y){
        this.abc = x;
        this.c = y;
    }
    TestClass1(String abc, char c, double y, int x){
        this.abc = abc; //this.abc refers to the instance reference variable String abc
        this.c = c;
        this.x = x;
        this.y = y;
    }
    void ShowDetails(){
        System.out.println("Showing your data members details: ");
        System.out.println("int x = "+(this.x)+"\ndouble y = "+y+"\nString Name = "+abc+"\nchar c = "+c);
    }
}
