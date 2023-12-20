import java.util.Scanner;

public class NumbersCartesianCoordinateSystem {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter x: ");
                int x = s.nextInt();
                System.out.println("Enter y:");
                int y = s.nextInt();

                if (x > 0 && y > 0) {
                        System.out.println("P(x, y) is in I - Quadrant!");
                } else if (x < 0 && y > 0) {
                        System.out.println("P(x, y) is in II - Quadrant!");
                } else if (x < 0 && y < 0) {
                        System.out.println("P(x, y) is in III - Quadrant!");
                } else if (x > 0 && y < 0) {
                        System.out.println("P(x, y) is in IV - Quadrant!");
                } else if (x == 0 && y == 0) {
                        System.out.println("P(x, y) is at Origin!");
                } else if (x == 0 && y > 0) {
                        System.out.println("P(x, y) is in Positive y - axis!");
                } else if (x == 0 && y < 0) {
                        System.out.println("P(x, y) is in Negative y - axis!");
                } else if (y == 0 && x > 0) {
                        System.out.println("P(x, y) is in Positive x - axis!");
                } else if (y == 0 && x < 0) {
                        System.out.println("P(x, y) is in Negative x - axis!");
                }

                s.close();
        }
}
