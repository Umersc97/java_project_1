package JavaProject1;

/*
 9) Maximum and minimum number in the array?
*/
public class Task9 {
    public static void main(String[] args) {

        int [] num = {43, 62, 3, 10, 98, 32};

        int maxNum = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i] > maxNum){
                maxNum = num[i];
            }
        }

        int minNum = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i] < minNum){
                minNum = num[i];
            }
        }
        System.out.println("The maximum number in the array is: " + maxNum);
        System.out.println("The minimum number in the array is: " + minNum);
    }
}

