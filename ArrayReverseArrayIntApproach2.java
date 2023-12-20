import java.util.Scanner;

class ReverseArrayIntApproach2 {
        public static int[] reverse(int originalArr[]) {
                int reversedArr[] = new int[originalArr.length];

                for (int i = 0; i <= originalArr.length - 1; i++) {
                        reversedArr[originalArr.length - i - 1] = originalArr[i];
                }

                return reversedArr;
        }
}

public class ArrayReverseArrayIntApproach2 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the size of array: ");
                int size = s.nextInt();

                int originalArr[] = new int[size];

                System.out.println("Enter the elements: ");
                for (int i = 0; i <= originalArr.length - 1; i++) {
                        originalArr[i] = s.nextInt();
                }

                int reversedArr[] = ReverseArrayIntApproach2.reverse(originalArr);

                System.out.println("Original Array: ");
                for (int i = 0; i <= originalArr.length - 1; i++) {
                        System.out.print(originalArr[i] + " ");
                }

                System.out.println();
                System.out.println("Reversed Array: ");
                for (int i = 0; i <= reversedArr.length - 1; i++) {
                        System.out.print(reversedArr[i] + " ");
                }

                s.close();
        }
}
