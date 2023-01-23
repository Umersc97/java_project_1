package JavaProject1;

/*
 3) Create a 2D array of integer values.
    Print the sum of all numbers.
*/
public class Task3 {
    public static void main(String[] args) {

        int sum = 0;
        int[][] matrix = new int[][]{{2,4,6},
                                     {9,6,3},
                                     {10,20,30}};

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                sum += matrix[i][j];
                System.out.println(sum);
    }
}
