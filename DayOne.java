public class DayOne {
    public static void main (String args[]) {
        System.out.println("Hello World");

        int x = 5;
        int y = 11;
        int z = 50;
        int a = 2;

        if (y>10) { // y is 10
            if (x==5) {
               System.out.println("y is greater than 10 and x is 5"); 
            }
        }
        else {
            System.out.println("y is not 10");
        }
        if (z>0) {
            if (z <= 100) {
                System.out.println("z is between 0 and 100");
            }
            else {
                System.out.println("z is not between 0 and 100");
            }
        }
        else {
            System.out.println("z is not between 0 and 100");
        }
        if (a%2 == 0) {
            System.out.println("a is even");
        }
        else {
            System.out.println("a is odd");
        }

    }
}

