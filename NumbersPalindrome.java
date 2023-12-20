import java.util.Scanner;

class Palindrome {
        public void palindrome(int num) {
                int rem = 0, rev = 0, n = num;
                while (num > 0) {
                        rem = num % 10;
                        rev = rev * 10 + rem;
                        num = num / 10;
                }

                System.out.println("Reverse is: " + rev);

                if (n == rev) {
                        System.out.println("PALINDROME!");
                } else {
                        System.out.println("NOT PALINDROME!");
                }
        }
}

public class NumbersPalindrome {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number to check Palindrome: ");
                int num = s.nextInt();

                Palindrome p = new Palindrome();
                p.palindrome(num);

                s.close();
        }
}
