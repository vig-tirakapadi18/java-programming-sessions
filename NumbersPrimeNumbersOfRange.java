import java.util.Scanner;

class PrimeNumbersOfRange {
        public boolean primeNums(int num) {
                if (num == 0 || num == 1) {
                        return false;
                } else if (num == 2) {
                        return true;
                } else {
                        for (int i = 2; i < num; i++) {
                                if (num % i == 0) {
                                        return false;
                                }
                        }
                }

                return true;
        }
}

public class NumbersPrimeNumbersOfRange {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the start of range: ");
                int start = s.nextInt();
                System.out.println("Enter end of range: ");
                int end = s.nextInt();

                PrimeNumbersOfRange prime = new PrimeNumbersOfRange();

                System.out.print("Prime numbers in range " + start + " and " + end + " are: ");
                for (int i = start; i <= end; i++) {
                        boolean res = prime.primeNums(i);
                        if (res == true)
                                System.out.print(i + " ");
                }

                s.close();
        }
}
