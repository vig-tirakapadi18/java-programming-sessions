import java.util.Scanner;

class PrimeNumberCheck {
        public void isPrime(int num) {
                int temp = 0;
                if (num > 1) {
                        for (int i = 2; i < num; i++) {
                                if (num % i == 0)
                                        temp++;
                        }
                } else {
                        temp++;
                }

                if (temp > 0)
                        System.out.println("NOT PRIME!");
                else
                        System.out.println("PRIME!");
        }
}

public class NumbersPrimeNumberCheck {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number to check Prime Number: ");
                int num = scan.nextInt();

                PrimeNumberCheck p = new PrimeNumberCheck();
                p.isPrime(num);

                scan.close();
        }
}
