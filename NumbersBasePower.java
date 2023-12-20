import java.util.Scanner;

class BasePower {
        public int findValue(int base, int pow) {
                int result = 1;
                for (int i = 1; i <= pow; i++) {
                        result = result * base;
                }
                return result;
        }
}

public class NumbersBasePower {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter BASE value: ");
                int base = s.nextInt();
                System.out.println("Enter POWER (EXPONENT) value: ");
                int pow = s.nextInt();

                BasePower bp = new BasePower();
                int result = bp.findValue(base, pow);
                System.out.println("The result is: " + result);

                s.close();
        }
}
