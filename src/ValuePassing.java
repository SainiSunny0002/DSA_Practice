import java.util.Scanner;

public class ValuePassing {
    int a = 5;
    static void doSomething(int a){
        a += 5;
        System.out.println("a in method : "+a);
    }
    public static void main(String[] args) {
        ValuePassing obj = new ValuePassing();
        doSomething(obj.a);
        System.out.println("a : " + obj.a);
    }
}
