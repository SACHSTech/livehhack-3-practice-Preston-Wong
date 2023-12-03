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

        System.out.println("What is the value of the first number? ");
        a = scanner.nextInt();
        System.out.println("What is the value of the second number? ");
        b = scanner.nextInt();

        System.out.println(shareDigit(a,b));
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

    /**
     * 
     * @param n the integer that is being examined 
     * @return true is the number is a multiple of 3 or 5 but not both
     */
    public static boolean old35(int n) {
        if (n%3 == 0 && n%5 == 0) {
            return false;
        } else if (n%3 == 0 || n%5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param a age of the first person
     * @param b age of the second person
     * @return the sum of the 2 ages unless one age is in the teens, then it returns 19
     */
    public static int teenSum(int a, int b){
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return (a + b);
        }
    }

    /**
     * 
     * @param str is the word that is being examined
     * @return fizz is it starts with f and buzz with it ends with buzz, fizbuzz if both are true
     */
    public static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        }
        else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    /**
     * 
     * @param a first integer
     * @param b second integer
     * @param c thrid interger
     * @param bOk allows to be true even if a is bigger then b
     * @return returns true if b is greater than a and c is greater than b, unless bOk is true, then only c needs to greater than b
     */
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk == true) {
            if (c > b) {
                return true;
            } else {
                return false;
            }
        } else {
            if (c > b && b > a) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 
     * @param a first integer 
     * @param b second integer
     * @param c thrid integer
     * @return return true if any of them is 10 over another, otherwise returns false
     */
    public static boolean lessBy10(int a, int b, int c) {
        if (a >= (b + 10) || a >= (c + 10)) {
            return true;
        } else if (b >= (a + 10) || b >= (c + 10)) {
            return true;
        } else if (c >= (b + 10) || c >= (a + 10)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return returns a number depending on if the numbers inputted are equal to each other or not
     */
    public static int redTicket(int a, int b, int c) {

        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && a == c && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return  1;
        } else {
            return 0;
        }
    }

    /**
     * 
     * @param a first integer
     * @param b second integer
     * @return returns true if they share a digit, otherwise it returns false
     */
    public static boolean shareDigit(int a, int b) {
        if (a/10 == b/10) {
            return true;
        } else if (a%10 == b%10) {
            return true;
        } else if (a/10 == b%10) {
            return true;
        } else if (a%10 == b/10) {
            return true;
        } else {
            return false;
        }
    }
}
