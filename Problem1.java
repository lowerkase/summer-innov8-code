import java.util.Scanner;
public class  Problem1 {
    public static void main (String args[]) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();
        //int y = 1;
        //while (x > 0) {
        //    y = y*x;
        //    x = x-1;
        //}
        //System.out.println(y);

        int y = 1;
        for (int i = x, i > 1; i--) {
            y = y*i;
        }
        System.out.println(y);
    }
}
