package JavaProject1;
import java.util.Arrays;
import java.util.Scanner;

 /*
 2) Using Scanner create an array of countries.
    When an array is created, retrieve all values
    from it and while retrieving those values print
    capital for each country. (use 2 different loops).
 */
public class Task2 {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         String[] country = {"", "", "", ""};
         System.out.println("Enter 4 Countries: ");
         for (int i = 0; i < country.length; i++) {
             country[i] = input.next();
         }
         System.out.println(Arrays.toString(country));

         for (int i = 0; i < country.length; i++) {
             if (country[i].equals("Canada")) {
                     System.out.println("the capital of Canada is Ottowa");
                 } else if (country[i].equals("Italy")) {
                     System.out.println("the capital of Italy is Rome");
                 } else if (country[i].equals("Greece")) {
                     System.out.println("the capital of Greece is Athens");
                 } else if (country[i].equals("Peru")) {
                     System.out.println("the capital of Peru is Lima");
                 } else {
                     System.out.println("Sorry, couldn't find the capital of " + country[i]);
                 }
         }
     }
 }



