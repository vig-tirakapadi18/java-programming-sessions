import java.util.Scanner;

class NumbersGreaterIn2Nums {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter 1st num: ");
                int num1 = s.nextInt();
                System.out.println("Enter 2nd num: ");
                int num2 = s.nextInt();

                if (num1 > num2) {
                        System.out.println("num1 " + num1 + " is greater!");
                } else {
                        System.out.println("num2 " + num2 + " is greater!");
                }

                s.close();
        }
}