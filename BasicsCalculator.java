import java.util.Scanner;

public class BasicsCalculator {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter 1st num: ");
                int a = s.nextInt();
                System.out.println("Enter 2nd num: ");
                int b = s.nextInt();

                int c = a + b;
                System.out.println("The addition of " + a + " and " + b + " is: " + c);

                c = a - b;
                System.out.println("The sub of " + a + " and " + b + " is: " + c);

                c = a * b;
                System.out.println("The multiplication of " + a + " and " + b + " is: " + c);

                c = a / b;
                System.out.println("The division of " + a + " and " + b + " is: " + c);

                c = a % b;
                System.out.println("The modulus of " + a + " and " + b + " is: " + c);

                s.close();
        }
}
