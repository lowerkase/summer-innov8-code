import java.util.Scanner;
public class  Problem3 {
    public static void main (String args[]) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();
        int y = 100;

        while (y > 0) {
            y = y - x;
        }

        if (y == 0) {
            System.out.println("Number is a factor of 100");
        }

        if (y < 0) {
            System.out.println("Number is not a factor of 100");
        }

        
    }
}
