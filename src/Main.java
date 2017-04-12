import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Prompt user to enter an integer between 1 and 100;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter an integer between 1 and 100: ");
        int num = scnr.nextInt();

        if (num < 1 || num > 100) {
            System.out.println("Your number is not an integer between 1 and 100, please try again.");
        } else { // If the integer is odd, print the number entered and "Odd."
            if (num % 2 == 1) {
                System.out.println(num + " Odd.");
            } // If the integer is even and between 2 and 25, print "Even and less than 25."
            if (num % 2 == 0 && num >= 2 && num <= 25) {
                System.out.println("Even and less than 25.");
            } // If the integer is even and between 26 and 60, print "Even."
            if (num % 2 == 0 && num >= 26 && num <= 60) {
                System.out.println("Even.");
            } // If the integer is even and greater than 60, print the number entered and "Even."
            if (num % 2 == 0 && num > 60) {
                System.out.println(num + " Even.");
            } // If the integer is odd and greater than 60, print the number entered and "Odd and over 60."
            if (num % 2 == 1 && num > 60) {
                System.out.println(num + " Odd and over 60.");
            }
        }
    }
}
