import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #1 || Question 4");

        // Q4 -> Write a program to convert kilometers to miles

        Scanner in = new Scanner(System.in);
        try {

            System.out.println("I'm a program that helps you convert kilometers to miles");
            System.out.println("Enter the value in kilometers");
            Float a = in.nextFloat();
            Float miles = (a) * 0.6213711F;
            System.out.println("The distance in miles is :");
            System.out.println(miles);

        } finally {
            in.close();
        }

    }
}
