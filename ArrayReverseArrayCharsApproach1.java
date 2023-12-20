import java.util.Scanner;

class ReverseArrayCharsApproach1 {
        public static char[] reverse(char originalArr[]) {
                char reversedArr[] = new char[originalArr.length];
                int j = originalArr.length - 1;

                for (int i = 0; i <= originalArr.length - 1; i++) {
                        reversedArr[j] = originalArr[i];
                        j--;
                }

                return reversedArr;
        }
}

public class ArrayReverseArrayCharsApproach1 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the size of array: ");
                int size = s.nextInt();
                char originalArr[] = new char[size];

                System.out.println("Enter the elements of array: ");
                for (int i = 0; i <= originalArr.length - 1; i++) {
                        originalArr[i] = s.next().charAt(0);
                }

                char reversedArr[] = ReverseArrayCharsApproach1.reverse(originalArr);

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
