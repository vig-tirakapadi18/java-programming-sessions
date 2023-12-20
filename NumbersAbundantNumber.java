import java.util.Scanner;

class AbundantNumber {
        public static void checkAbundantNum(int num) {
                int sum = 0;
                for (int i = 1; i < num; i++) {
                        if (num % i == 0) {
                                sum = sum + i;
                        }
                }
                if (sum > num) {
                        System.out.println("Abundant Number!");
                } else {
                        System.out.println("Not Abundant Number!");
                }
        }
}

public class NumbersAbundantNumber {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number to check if it is Abundant Number: ");
                int num = s.nextInt();

                AbundantNumber.checkAbundantNum(num);

                s.close();
        }
}
