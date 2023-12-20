import java.util.Scanner;

class SumOfRange {
        public int sumOfRange(int start, int end) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                        sum = sum + i;
                }

                return sum;
        }
}

public class BasicsSumOfRange {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter start range: ");
                int start = scan.nextInt();
                System.out.println("Enter end range: ");
                int end = scan.nextInt();

                SumOfRange s = new SumOfRange();
                int res = s.sumOfRange(start, end);

                System.out.println("The sum of range " + start + " to " + end + " is: " + res);

                scan.close();
        }
}
