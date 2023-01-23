package JavaProject1;

/*
 6) Write a program to swap 2 numbers
    without a temporary variable
*/
public class Task6 {
    public static void main(String[] args) {

        int x = 3;
        int y = 6;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x + " " + y);
    }
}
