import java.util.Scanner;

class PrimeNumbersUptoN {
        public boolean primeNums(int num) {
                if (num == 0 || num == 1) {
                        return false;
                } else if (num == 2) {
                        return true;
                } else {
                        for (int i = 2; i < num; i++) {
                                if (num % i == 0)
                                        return false;
                        }
                }

                return true;
        }
}

public class NumbersPrimeNumbersUptoN {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter limit (N): ");
                int num = s.nextInt();

                PrimeNumbersUptoN prime = new PrimeNumbersUptoN();

                for (int i = 1; i <= num; i++) {
                        boolean res = prime.primeNums(i);
                        if (res == true) {
                                System.out.println(i);
                        }
                }

                s.close();
        }
}
