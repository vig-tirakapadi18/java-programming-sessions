import java.util.Scanner;

class SumOfDigits {

        public int sumOfDigits(int num) {
                int rem = 0;
                int sum = 0;

                while (num > 0) {
                        rem = num % 10;
                        sum = sum + rem;
                        num = num / 10;
                }
                return sum;
        }
}

public class NumbersSumOfDigits {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a num to find its sum of digits: ");
                int num = scan.nextInt();
                SumOfDigits s = new SumOfDigits();
                int res = s.sumOfDigits(num);

                System.out.println("Sum of digits of " + num + " is: " + res);

                scan.close();
        }
}
