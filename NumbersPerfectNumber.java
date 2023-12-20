import java.util.Scanner;

class PerfectNumber {
        public static int checkPerfect(int num) {
                int sum = 0;
                for (int i = 1; i < num; i++) {
                        if (num % i == 0)
                                sum = sum + i;
                }
                return sum;
        }
}

public class NumbersPerfectNumber {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number to check if it is a perfect number: ");
                int num = s.nextInt();

                int result = PerfectNumber.checkPerfect(num);

                if (num == result)
                        System.out.println("PERFECT NUMBER!");
                else
                        System.out.println("NOT PERFECT NUMBER!");

                s.close();
        }
}
