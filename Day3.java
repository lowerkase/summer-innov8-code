import java.util.Scanner;
import java.util.Arrays;



public class Day3 {

    public static void myFunction() {
    System.out.println("Hello World");
    return;
    }

    public static void easyPrint(String s) {
        System.out.println(s);
    }

    public static int getFactorial(int x) {
        int y = 1;
        while (x > 0) {
            y = y*x;
            x = x-1;
        }
        return y;
    }

    public static int getFac(int x) {
        int y = 1;
        for (int i = x; i > 1; i--) {
            y = y*i;
        }
        return y;
    }

    public static void main (String args[]) {

        //myFunction();
        //easyPrint("hello");
        //int answer = getFactorial(5);
        //System.out.println(answer);
        //Scanner scan = new Scanner (System.in);
        //System.out.println("Enter a number");
        //int x = scan.nextInt();
        //getFac(x);

        int things[] = {1,2,3,4,5};
        //System.out.println(things[4]);
        //System.out.println(things.length);

        for (int i = things.length - 1; i >= 0; i--) {
            System.out.println(things[i]);
        }

        for (int number:things) {
            System.out.println(number);
        }

        String str = "Hello World";
        //System.out.println(str.charAt(1));         // The character at index 1
        //System.out.println(str.toUpperCase());
        //System.out.println(str.replace(" ","\n")); // \n always means new line
        String[] words = str.split(" ");           // Splits the string everytime it sees a space, creates an array
        System.out.println(Arrays.toString(words));

        
    }
}