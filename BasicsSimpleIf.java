import java.util.Scanner;

public class BasicsSimpleIf {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("PRESS 1: ");
                int n = s.nextInt();

                if (n == 1) {
                        System.out.println("CORRECT!");
                }

                System.out.println("WRONG!");

                s.close();
        }
}
