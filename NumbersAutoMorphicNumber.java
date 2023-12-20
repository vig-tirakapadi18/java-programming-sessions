import java.util.Scanner;

class AutoMorphicNumber {
        public static boolean checkAutoMorphic(int num) {
                int sq = num * num;

                while (num > 0) {
                        int sqRem = sq % 10;
                        int numRem = num % 10;

                        if (sqRem != numRem) {
                                return false;
                        }

                        num = num / 10;
                        sq = sq / 10;
                }

                return true;
        }
}

public class NumbersAutoMorphicNumber {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number to check if it is AutoMorphic: ");
                int num = s.nextInt();

                boolean result = AutoMorphicNumber.checkAutoMorphic(num);

                if (!result)
                        System.out.println("Not AutoMorphic!");
                else
                        System.out.println("AutoMorphic!");

                s.close();
        }
}
