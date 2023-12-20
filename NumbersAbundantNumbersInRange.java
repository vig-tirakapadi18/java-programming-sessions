import java.util.Scanner;

class AbundantNumbersInRange {
        public static void printAbundantNums(int num) {
                int sum = 0;
                for (int i = 1; i < num; i++)
                        if (num % i == 0)
                                sum = sum + i;

                if (sum > num)
                        System.out.print(num + " ");
        }
}

public class NumbersAbundantNumbersInRange {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a start of range: ");
                int start = s.nextInt();
                System.out.println("Enter a end of range: ");
                int end = s.nextInt();

                System.out.println("The Abundant numbers in range " + start + " to " + end + " are: ");
                for (int i = start; i <= end; i++) {
                        AbundantNumbersInRange.printAbundantNums(i);
                }

                s.close();
        }
}
