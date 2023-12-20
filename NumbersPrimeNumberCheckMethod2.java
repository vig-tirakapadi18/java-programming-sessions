import java.util.Scanner;

class PrimeNumberCheck2 {
        public boolean isPrime(int num) {
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

public class NumbersPrimeNumberCheckMethod2 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a num to check Prime Number: ");
                int num = s.nextInt();

                PrimeNumberCheck2 prime = new PrimeNumberCheck2();
                boolean res = prime.isPrime(num);
                if (res == true)
                        System.out.println("PRIME!");
                else
                        System.out.println("NOT PRIME!");

                s.close();
        }
}
