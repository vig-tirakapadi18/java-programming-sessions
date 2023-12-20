import java.util.Scanner;

class FactorialOfNum {
        public static long factorial(int num) {
                long res = 1;
                for (int i = 1; i <= num; i++) {
                        res = res * i;
                }
                // for (int i = num; i >= 1; i--) {
                // res = res * i;
                // }

                return res;
        }
}

public class NumbersFactorialOfNum {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number to find it's factorial: ");
                int num = s.nextInt();

                long result = FactorialOfNum.factorial(num);
                System.out.println("Factorial of " + num + " is: " + result);

                s.close();
        }
}
