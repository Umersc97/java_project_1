package JavaProject1;
import java.util.Arrays;
import java.util.Scanner;

 /*
 1) Using Scanner create an array of integer values.
    After the array is created, calculate the sum of
    all stored elements in that array.
 */
public class Task1 {
    public static void main(String[] args) {

        int length;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter integer values: ");
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Your array is: " + Arrays.toString(arr));

        // Sum of the array
        for (int i = 0; i < length; i++) {
            sum += (arr[i]);
        }
        System.out.println("The sum of all stored elements is: " + sum);
    }
}
