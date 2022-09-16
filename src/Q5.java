import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #1 || Question 5");

        // Q5 -> Write a program to detect whether a number entered by user is integer
        // or not

        Scanner in = new Scanner(System.in);
        try {

            System.out.println("I'm a program that helps you identify the number entered by user is integer or not");
            System.out.println("Enter the number");
            System.out.println(in.hasNextInt());

        } finally {
            in.close();
        }
    }
}
