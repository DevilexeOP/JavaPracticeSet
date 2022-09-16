import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #1 || Question 2 ");

        // Q2 -> Find the CGPA using marks of 3 subjects (out of 100)
        Scanner in = new Scanner(System.in);
        try {

            System.out.println("I'm a program that helps you find your CGPA ");
            System.out.println("Enter the marks of 3 subjects to find CGPA");
            float total = 500;
            System.out.println("Physics : ");
            Float a = in.nextFloat();
            System.out.println("Chemistry : ");
            Float b = in.nextFloat();
            System.out.println("Maths : ");
            Float c = in.nextFloat();
            System.out.println("English : ");
            Float d = in.nextFloat();
            System.out.println("Computer Science : ");
            Float e = in.nextFloat();

            Float sum = a + b + c + d + e;
            System.out.println("Number of marks obtained out of 300");
            System.out.println(sum);

            Float percentage = (sum / total) * 100;
            System.out.println("Percentage obtained");
            System.out.println(percentage);

            Float cgpa = (percentage) / 9.5F;
            System.out.println("Your CGPA is : ");
            System.out.println(cgpa);

        } finally {
            in.close();
        }

    }
}
