import java.util.Scanner;

class HarshedNumber {
        public static void checkHarshedNum(int num) {
                int rem = 0, sum = 0, n = num;
                while (num > 0) {
                        rem = num % 10;
                        sum = sum + rem;
                        num = num / 10;
                }

                if (n % sum == 0) {
                        System.out.println("Harshed Number!");
                } else {
                        System.out.println("Not Harshed Number!");
                }
        }
}

public class NumbersHarshedNumber {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number to check if it is Harshed Number: ");
                int num = s.nextInt();

                HarshedNumber.checkHarshedNum(num);

                s.close();
        }
}
