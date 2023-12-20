import java.util.Scanner;

class ArmstrongNumsInRange {
        public static int findCount(int num) {
                int rem = 0, count = 0;
                rem = num % 10;
                count++;
                num = num / 10;
                return count;
        }

        public static int calcSum(int num, int power) {
                int rem = 0, sum = 0;

                while (num > 0) {
                        rem = num % 10;
                        int res = (int) Math.pow(rem, power);
                        sum = sum + res;
                        num = num / 10;
                }

                return sum;
        }
}

public class NumbersArmstrongNumsInRange {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a start of range: ");
                int start = s.nextInt();
                System.out.println("Enter a end of range: ");
                int end = s.nextInt();

                int count = 0;

                for (int i = start; i <= end; i++) {
                        int power = Armstrong.countDigits(i);
                        int result = Armstrong.calcSum(i, power);

                        if (i == result) {
                                System.out.println(i + " ");
                                count++;
                        }
                }

                System.out.println("Count of Armstrong numbers in range " + start + " to " + end + " is:" + count);

                s.close();
        }
}
