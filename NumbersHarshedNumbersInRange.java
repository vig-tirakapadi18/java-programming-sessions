import java.util.Scanner;

class HarshedNumbersInRange {
        public static void checkHarshed(int num) {
                int rem = 0, sum = 0, n = num;
                while (num > 0) {
                        rem = num % 10;
                        sum = sum + rem;
                        num = num / 10;
                }

                if (n % sum == 0) {
                        System.out.print(n + " ");
                }
        }
}

public class NumbersHarshedNumbersInRange {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a start of Range: ");
                int start = s.nextInt();
                System.out.println("Enter a end of Range: ");
                int end = s.nextInt();

                for (int i = start; i <= end; i++) {
                        HarshedNumbersInRange.checkHarshed(i);
                }
                s.close();
        }
}
