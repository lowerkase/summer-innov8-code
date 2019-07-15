import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {


    // Function 1
    public static void capsLock () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a word or phrase");
        String str = scan.nextLine();
        System.out.println(str.toUpperCase());
    }

    //Function 2
    public static int wordCount () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a word or phrase");
        String str = scan.nextLine();
        String[] words = str.split(" ");
        System.out.println(words.length);           
        return words.length;
    }

    //Function 3
    public static int highestInt () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter some numbers, separated by commas");
        String str = scan.nextLine();
        String things[] = str.split(",");
        int x = Integer.parseInt(things[0]);
        for (int i = things.length; i > 0; i--) {
            if (Integer.parseInt(things[i-1]) > x) {
                x = Integer.parseInt(things[i-1]);
            }
        }
        System.out.println(x);
        return x;
    }

    //Function 4
    public static int meanInt () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter some numbers, separated by commas");
        String str = scan.nextLine();
        String things[] = str.split(",");
        int x = 0;
        for (int i = things.length; i > 0; i--) {
            x = x + Integer.parseInt(things[i-1]);
        }
        x = x/things.length;
        System.out.println(x);
        return x;
    }

    //Function 5
    public static String[] sevenTwelve () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter some numbers, separated by commas");
        String str = scan.nextLine();
        String things[] = str.split(",");
        for (int i = 1; i <= things.length; i++) {
            if (Integer.parseInt(things[i-1]) == 7) {
                System.out.print("12, ");
            }
            else System.out.print(Integer.parseInt(things[i-1])+", ");
        }
        System.out.println(" ");
        return things;
    }

    //Function 6
    public static String reverse () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a word or phrase");
        String str = scan.nextLine();
        String[] words = str.split(" ");
        int x = 0;
        String y[] = new String[words.length];
        for (int i = words.length; i > 0; i--) {
            y[x] = words[i-1];
            x = x+1;
        }
        
        System.out.println(Arrays.toString(y));
        return Arrays.toString(y);
    }

    //Function 7
    public static void compare () {
        Scanner thing = new Scanner (System.in);
        System.out.println("Enter some numbers, separated by commas");
        String strUno = thing.nextLine();
        String things[] = strUno.split(",");
        Scanner stuffs = new Scanner (System.in);
        System.out.println("Enter some more numbers, separated by commas");
        String strDos = stuffs.nextLine();
        String stuff[] = strDos.split(",");
        if (things.length != stuff.length) {
            System.out.println("The arrays are not identical");
            return;
        }
        for (int i = things.length; i > 0; i--) {
            if (things[i-1] != stuff[i-1]) {
                System.out.println("The arrays are not identical");
                return;
            }
        }
        System.out.println("The arrays are identical");
    }

    public static void main (String args[]) {

        
        compare();

        //Scanner scan = new Scanner (System.in);
        //System.out.println("Enter a number");
        //int x = scan.nextInt();


    }
}