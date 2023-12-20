import java.util.Scanner;

class BasePowerWithInbuiltMethod {
        public int findValue(int base, int pow) {
                return (int) Math.pow(base, pow);
        }
}

public class NumbersBasePowerWithInbuiltMethod {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter BASE value: ");
                int base = s.nextInt();
                System.out.println("Enter POWER(EXPONENT) value: ");
                int pow = s.nextInt();

                BasePowerWithInbuiltMethod power = new BasePowerWithInbuiltMethod();
                int result = power.findValue(base, pow);
                System.out.println("The result is: " + result);

                s.close();
        }
}