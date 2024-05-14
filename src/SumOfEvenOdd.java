import java.util.Scanner;

public class SumOfEvenOdd {
    static void sum(int n){
        int sumOdd = 0, sumEven = 0;
        while (n != 0){
            if (n % 2 == 1){
                sumOdd += n % 10;
            }else{
                sumEven += n % 10;
            }
            n /= 10;
        }
        System.out.println(sumEven + " " + sumOdd);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        sum(n);
    }
}
