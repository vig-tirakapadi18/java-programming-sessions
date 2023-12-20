import java.util.Scanner;

class PrimeNumbersRangeWithCount {
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

public class NumbersPrimeNumbersOfRangeWithCount {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter start range: ");
                int start = s.nextInt();
                System.out.println("Enter end range: ");
                int end = s.nextInt();

                int count = 0;

                PrimeNumbersRangeWithCount prime = new PrimeNumbersRangeWithCount();

                System.out.println("Prime numbers in range " + start + " to " + end + " are: ");
                for (int i = start; i <= end; i++) {
                        boolean res = prime.primeNums(i);
                        if (res == true) {
                                count++;
                                System.out.print(i + " ");
                        }
                }
                System.out.println();
                System.out.println("Count of prime numbers: " + count);

                s.close();
        }
}
