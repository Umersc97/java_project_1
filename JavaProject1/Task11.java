package JavaProject1;

/*
 10) Write a program to print out duplicate
     elements from an Array of Strings
*/
public class Task11 {

    public static void main(String[] args) {

        String [] cat = {"Tiger", "Lion", "Cheetah", "Tiger", "Lynx", "Lion"};

        for (int i = 0; i < cat.length; i++) {
            for (int j = i + 1; j < cat.length; j++) {
                if(cat[i].equals(cat[j])){
                    System.out.println(cat[j]);
                }
            }
        }
    }
}
