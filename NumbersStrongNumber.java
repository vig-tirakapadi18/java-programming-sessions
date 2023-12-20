import java.util.Scanner;

class StrongNumber {
        public static long calcStrongNum(int num) {
                long fact = 1, sum = 0;
                int rem = 0;

                while (num > 0) {
                        rem = num % 10;

                        for (int i = 1; i <= rem; i++) {
                                fact = fact * i;
                        }
                        sum = sum + fact;
                        fact = 1;
                        num = num / 10;
                }

                return sum;
        }
}

class NumbersStrongNumber {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number to check if it is Strong or not: ");
                int num = s.nextInt();

                long result = StrongNumber.calcStrongNum(num);
                System.out.println(result);

                if (num > 0) {
                        if (num == result)
                                System.out.println("STRONG NUMBER!");
                        else
                                System.out.println("NOT STRONG NUMBER!");
                } else {
                        System.out.println("Invalid number (Number must be > 0)!");
                }

                s.close();
        }
}