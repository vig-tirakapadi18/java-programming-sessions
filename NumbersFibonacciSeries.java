import java.util.Scanner;

class FibonacciSeries {
        public static void printSeries(int num) {
                int num1 = 0, num2 = 1, fib = 0;

                if (num == 1) {
                        System.out.println("Fibonacci Series: " + num1);
                } else if (num == 2) {
                        System.out.println("Fibonacci Series: " + num1 + " " + num2);
                } else {
                        System.out.print("Fibonacci Series: " + num1 + " " + num2 + " ");
                        for (int i = 3; i <= num; i++) {
                                fib = num1 + num2;
                                System.out.print(fib + " ");
                                num1 = num2;
                                num2 = fib;
                        }
                }
        }
}

public class NumbersFibonacciSeries {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a num: ");
                int num = s.nextInt();

                if (num > 0)
                        FibonacciSeries.printSeries(num);
                else
                        System.out.println("Invalid number!");

                s.close();
        }
}
