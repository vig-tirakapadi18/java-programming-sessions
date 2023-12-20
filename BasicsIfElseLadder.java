import java.util.Scanner;

public class BasicsIfElseLadder {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("PRESS ANY ONE NUM 1-4: ");
                int n = s.nextInt();

                if (n == 1) {
                        System.out.println("ONE");
                } else if (n == 2) {
                        System.out.println("TWO");
                } else if (n == 3) {
                        System.out.println("THREE");
                } else if (n == 4) {
                        System.out.println("FOUR");
                } else {
                        System.out.println("Invalid Choice!");
                }

                s.close();
        }
}
