import java.util.Scanner;

class FactorsOfAnyNum {
        public static void findFactors(int num) {
                System.out.print("Factors of " + num + " : ");
                for (int i = 1; i <= num; i++) {
                        if (num % i == 0) {
                                System.out.print(i + " ");
                        }
                }
        }
}

public class NumbersFactorsOfAnyNum {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number to find it's factors: ");
                int num = s.nextInt();

                FactorsOfAnyNum.findFactors(num);

                s.close();
        }
}
