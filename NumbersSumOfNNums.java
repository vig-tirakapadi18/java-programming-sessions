import java.util.Scanner;

class SumOfNNums {
        public int sumOfNNums(int n) {
                int sum = 0;

                for (int i = 1; i <= n; i++) {
                        sum = sum + i;
                }

                return sum;
        }
}

public class NumbersSumOfNNums {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter n: ");
                int n = scan.nextInt();

                SumOfNNums s = new SumOfNNums();
                int res = s.sumOfNNums(n);
                System.out.println("The sum of first " + n + " numbers: " + res);

                scan.close();
        }
}
