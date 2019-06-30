import java.util.Arrays;

public class Homework3 {


    // Function 1
    public static void capsLock (String str) {
        System.out.println(str.toUpperCase());
    }

    //Function 2
    public static int wordCount (String str) {
        String[] words = str.split(" ");
        System.out.println(words.length);           
        return words.length;
    }

    //Function 3
    public static int highestInt (int things[]) {
        int x = 0;
        for (int i = things.length; i > 0; i--) {
            if (things[i-1] > x) {
                x = things[i-1];
            }
        }
        System.out.println(x);
        return x;
    }

    //Function 4
    public static int meanInt (int things[]) {
        int x = 0;
        for (int i = things.length; i > 0; i--) {
            x = x + things[i-1];
        }
        x = x/things.length;
        System.out.println(x);
        return x;
    }

    //Function 5
    public static int[] sevenTwelve (int things[]) {
        for (int i = things.length; i > 0; i--) {
            if (things[i-1] == 7) {
                things[i-1] = 12;
            }
        }
        System.out.println(things);
        return things;
    }

    //Function 6
    public static String reverse (String str) {
        String[] words = str.split(" ");
        int x = 0;
        int y[] = new int[words.length];
        for (int i = words.length; i > 0; i--) {
            y[x] = words[i-1];
            x = x+1;
        }
        System.out.println(Arrays.toString(y));
        return Arrays.toString(y);
    }

    //Function 7
    public static void compare (int things[],int stuff[]) {
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
        


    }
}