package JavaProject1;

/*
 8) Write a Java Program to print the first 10
    numbers of Fibonacci series
*/
public class Task8 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int fibSeq = 0;
        System.out.print(num1 + " " + num2);

        for (int i = 2; i < 10; i++) {
            fibSeq = num1 + num2;
            num1 = num2;
            num2 = fibSeq;
            System.out.print(" " + fibSeq);
        }
    }
}
