import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws Exception {
        System.out.println("This is a Practice Set #1 || Question 1 ");

        // Q1 -> Add 3 numbers in java
        Scanner in = new Scanner(System.in);
        try {

            System.out.println("I'm a program that helps you add numbers ");
            System.out.println("Input 3 numbers to sum them up");
            Float a = in.nextFloat();
            Float b = in.nextFloat();
            Float c = in.nextFloat();
            Float sum = a + b + c;
            System.out.println(sum);
        } finally {
            in.close();
        }
    }

}
