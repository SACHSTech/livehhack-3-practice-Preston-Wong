import java.util.Scanner;

/**
 * livehack 3 practice 
 * @author Preston Wong
 *
 */

// Basic Java Program

public class Main {
    public static void main(String[] args) {
        // make test calls to your methods here
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("What is the valeu of the first integer? ");
        a = scanner.nextInt();
        System.out.println("What is the value fo the second int? ");
        b = scanner.nextInt();

        System.out.println(sortaSum(a, b));
    }

    /**
     * 
     * @param you is your stlye rating
     * @param date is your dates style rating 
     * @return depending on you and your date's style rating, it will return a number from 0 - 2
     */

    public static int dateFashion(int you, int date) {
        if (you > 2 && date > 2) {
            if (you >= 8 || date >= 8) {
                return 2;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    /**
     * 
     * @param a is the first int
     * @param b is the second int
     * @return returns the sum of the two integers, but if the sum is 10 or 19, it returns 20
     */
    public static int sortaSum(int a, int b) {
        
        if ((a + b) >= 10 && (a + b) <= 19) {
            return 20;
        } else {
            return (a + b);
        }
    }  
}
