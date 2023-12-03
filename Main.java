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

        int n;

        System.out.println("What is your number? ");
        n = scanner.nextInt();

        System.out.println(old35(n));
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
    
    /**
     * 
     * @param n the integer that is being determined to be within 10
     * @param outsideMode if you are allowed to go outside the 1 - 10 range
     * @return returns true or false depending on if the number is within 1 - 10 when outsideMode is false
     */
    public static boolean in1To10(int n, boolean outsideMode) {
        
        if (outsideMode == false) {
            if (n >= 1 && n <= 10) {
                return true;
            } else {
                return false;
            }
        } else {
            if (n <= 1 || n >= 10 ) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean old35(int n) {
        if (n%3 == 0 && n%5 == 0) {
            return false;
        } else if (n%3 == 0 || n%5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
