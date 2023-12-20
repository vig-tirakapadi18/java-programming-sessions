import java.util.Scanner;

class PerfectNumbersInRange {
        public static int checkPerfect(int num) {
                int sum = 0;
                for (int i = 1; i < num; i++) {
                        if (num % i == 0)
                                sum = sum + i;
                }
                return sum;
        }
}

public class NumbersPerfectNumbersInRange {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a start of range: ");
                int start = s.nextInt();
                System.out.println("Enter a end of range: ");
                int end = s.nextInt();

                System.out.println("Perfect numbers between " + start + " to " + end + " are: ");
                for (int i = start; i <= end; i++) {
                        int result = PerfectNumbersInRange.checkPerfect(i);

                        if (i == result)
                                System.out.print(i + " ");

                }

                s.close();
        }
}
