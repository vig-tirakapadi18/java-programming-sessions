import java.util.Scanner;

class Armstrong {
        public static int countDigits(int num) {
                int count = 0, rem = 0;

                while (num > 0) {
                        rem = num % 10;
                        count++;
                        num = num / 10;
                }

                return count;
        }

        public static int calcSum(int num, int power) {
                int res = 1, sum = 0, rem = 0;

                while (num > 0) {
                        rem = num % 10;
                        res = (int) Math.pow(rem, power);
                        sum = sum + res;
                        num = num / 10;
                }

                return sum;
        }
}

public class NumbersArmstrong {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number to check Armstrong: ");
                int num = s.nextInt();

                int power = Armstrong.countDigits(num);

                int result = Armstrong.calcSum(num, power);

                if (num == result)
                        System.out.println("ARMSTRONG!");
                else
                        System.out.println("NOT ARMSTRONG!");

                s.close();
        }
}
