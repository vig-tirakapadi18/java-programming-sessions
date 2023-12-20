import java.util.Scanner;

class StrongNumbersInRange {
        public static long calcStrongNum(long num) {
                long fact = 1, sum = 0, rem = 0;
                while (num > 0) {

                        rem = num % 10;

                        for (int i = 1; i <= rem; i++) {
                                fact = fact * i;
                        }

                        sum = sum + fact;
                        fact = 1;
                        num = num / 10;
                }

                return sum;
        }
}

public class NumbersStrongNumbersInRange {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a start of range: ");
                int start = s.nextInt();
                System.out.println("Enter a end of range: ");
                int end = s.nextInt();

                System.out.println("Strong numbers in between " + start + " to " + end + " are: ");
                for (long i = start; i <= end; i++) {
                        long result = StrongNumbersInRange.calcStrongNum(i);

                        if (i == result) {
                                System.out.print(i + " ");
                        }
                }

                s.close();
        }
}
