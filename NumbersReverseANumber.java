import java.util.Scanner;

class ReverseANumber {
        public int reverseNumber(int num) {
                int rem = 0, rev = 0;

                while (num > 0) {
                        rem = num % 10;
                        rev = rev * 10 + rem;
                        num = num / 10;
                }

                return rev;
        }
}

public class NumbersReverseANumber {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number to reverse: ");
                int num = s.nextInt();

                ReverseANumber revNum = new ReverseANumber();
                int res = revNum.reverseNumber(num);
                System.out.println("Reverse of " + num + " is: " + res);

                s.close();
        }
}
