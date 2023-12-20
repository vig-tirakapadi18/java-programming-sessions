import java.util.Scanner;

class FriendlyPairs {
        public static int findDivisorsSum(int num) {
                int sum = 0;
                for (int i = 1; i <= num; i++) {
                        if (num % i == 0) {
                                sum = sum + i;
                        }
                }

                return sum;
        }
}

public class NumbersFriendlyPairs {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter 1st num: ");
                int num1 = s.nextInt();
                System.out.println("Enter 2st num: ");
                int num2 = s.nextInt();

                int sum1 = FriendlyPairs.findDivisorsSum(num1);
                int sum2 = FriendlyPairs.findDivisorsSum(num2);

                int res1 = sum1 / num1;
                int res2 = sum2 / num2;

                if (res1 == res2)
                        System.out.println("Friendly Numbers!");
                else
                        System.out.println("Not Friendly Numbers!");

                s.close();
        }
}
