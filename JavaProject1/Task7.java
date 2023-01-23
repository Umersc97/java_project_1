package JavaProject1;
import java.util.Scanner;

/*
 7) Write a java program to check whether a given
    number is prime or not
*/
public class Task7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        boolean primeNumber = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                {
                    primeNumber = true;
                    break;
                }
            }
            if (primeNumber)
                System.out.println(num + " is a Prime Number");
            else
                System.out.println(num + " is not a Prime Number");
        }
    }
}