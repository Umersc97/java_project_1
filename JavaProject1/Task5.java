package JavaProject1;

/*
 5) Create a 2D array of integers.
    Develop a program which will calculate
    the sum of even and odd numbers for that array.
*/
public class Task5 {

    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;
        int totalSum;
        int[][] matrix = new int[][]{{33, 56, 67},
                                     {21, 74, 10},
                                     {15, 29, 30, 93}};

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if(matrix[i][j]%2==0)
                    sumEven += matrix[i][j];
                System.out.println("Sum of even numbers is: " + sumEven);

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if(matrix[i][j]%2!=0)
                    sumOdd += matrix[i][j];
                System.out.println("Sum of odd numbers is: " + sumOdd);

                totalSum = sumEven + sumOdd;
        System.out.println("Sum of even and odd numbers is: " + totalSum);
    }
}
