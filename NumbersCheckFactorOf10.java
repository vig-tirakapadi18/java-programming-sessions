import java.util.Scanner;

class CheckFactorOf10 {
        public static void checkFactor(int num) {
                if (num > 10 || num <= 0) {
                        System.out.println("Number entered must not be greater than 10 or less than or equal to 0!");
                } else {
                        if (10 % num == 0)
                                System.out.println("Number " + num + " is factor of 10!");
                        else
                                System.out.println("Number " + num + " is not factor of 10!");
                }
        }
}

public class NumbersCheckFactorOf10 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number to check if it is a factor of 10: ");
                int num = s.nextInt();

                CheckFactorOf10.checkFactor(num);

                s.close();
        }
}
