import java.util.Scanner;

public class NumbersGreatestOf3Nums {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter 1st num: ");
                int num1 = s.nextInt();

                System.out.println("Enter 2st num: ");
                int num2 = s.nextInt();

                System.out.println("Enter 3st num: ");
                int num3 = s.nextInt();

                if (num1 > num2 && num1 > num3) {
                        System.out.println("num1 " + num1 + " is greatest!");
                } else if (num2 > num1 && num2 > num3) {
                        System.out.println("num2 " + num2 + " is greatest!");
                } else {
                        System.out.println("num3 " + num3 + " is greatest!");
                }

                s.close();
        }
}
