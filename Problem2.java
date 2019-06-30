import java.util.Scanner;
public class  Problem2 {
    public static void main (String args[]) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();
        int y = 0;
        y = x;
        int z = 0;
        
        
        while (x >= 1) {
            System.out.println("*");
            z = y - x;
            while (z >= 0) {
                System.out.print("*");
                z = z-1;
            }
            x = x-1;
        }
    }
}
