import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #1 || Question 3");

        // Q3 -> Write a program tht asks user to input name and then greets them with
        // "hello ,<name> - have a good day" text

        Scanner in = new Scanner(System.in);
        try {

            System.out.println("I'm a program that greets you when you enter your name <3 ");
            System.out.println("Enter your name ");
            String str = in.nextLine();
            System.out.println("Hello ," + str + "- have a good day");

        } finally {
            in.close();
        }

    }
}
