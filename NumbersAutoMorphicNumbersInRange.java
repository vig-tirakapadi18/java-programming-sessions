import java.util.Scanner;

class AutoMorphicNumbersInRange {
        public static boolean checkAutoMorphic(int num) {
                int sq = num * num;

                while (num > 0) {
                        int sqRem = sq % 10;
                        int numRem = num % 10;

                        if (sqRem != numRem) {
                                return false;
                        }

                        sq = sq / 10;
                        num = num / 10;
                }

                return true;
        }
}

public class NumbersAutoMorphicNumbersInRange {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a start of range: ");
                int start = s.nextInt();
                System.out.println("Enter a end pf range: ");
                int end = s.nextInt();

                System.out.print("The AutoMorphic Numbers in range " + start + " to " + end + " are: ");
                for (int i = start; i <= end; i++) {
                        boolean result = AutoMorphicNumbersInRange.checkAutoMorphic(i);

                        if (result) {
                                System.out.print(i + " ");
                        }
                }

                s.close();
        }
}
