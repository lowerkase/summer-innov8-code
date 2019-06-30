import java.util.Scanner;
public class  Problem5 {
    public static void main (String args[]) {

        int y = (int)(Math.random() * 101);
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();
        
        while (x != y) {
            if (x > y ) {
            System.out.println("That number is too high. ");
            }
            if (x < y) {
            System.out.println("That number is too low. ");
            }
            System.out.println("Enter another number");
            x = scan.nextInt();
        }
        
        if (x == y) {
            System.out.println("Correct!");
        }

    }
}
