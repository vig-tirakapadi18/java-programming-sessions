import java.util.Scanner;

class AmicableNumbers {
        public static int findFactorsSum(int num) {
                int sum = 0;
                for (int i = 1; i < num; i++) {
                        if (num % i == 0)
                                sum = sum + i;
                }
                return sum;
        }
}

public class NumbersAmicableNumbers {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a 1st num: ");
                int num1 = s.nextInt();
                System.out.println("Enter a 2nd num: ");
                int num2 = s.nextInt();

                int result1 = AmicableNumbers.findFactorsSum(num1);
                int result2 = AmicableNumbers.findFactorsSum(num2);

                if (result1 == num2 && result2 == num1) {
                        System.out.println("Amicable Number or Friendly Pair!");
                } else {
                        System.out.println("NOT Amicable Number or Friendly Pair!");
                }

                s.close();
        }
}
