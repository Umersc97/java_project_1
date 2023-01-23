package JavaProject1;

/*
 4) Create a 2D array or integer type where you will
    store odd and even numbers. Develop a program which
    will identify/print the even numbers only.
*/
public class Task4 {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{{33, 56, 67},
                                     {21, 74, 10},
                                     {15, 29, 30, 93}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)  {
                if(matrix[i][j]%2==0)
                    System.out.println(matrix[i][j]);
            }
        }
    }
}

