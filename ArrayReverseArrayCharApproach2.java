import java.util.Scanner;

class ReverseArrayCharApproach2 {
        public static char[] reverse(char originalArr[]) {
                char reversedArr[] = new char[originalArr.length];

                for (int i = 0; i <= originalArr.length - 1; i++) {
                        reversedArr[originalArr.length - i - 1] = originalArr[i];
                }

                return reversedArr;
        }
}

public class ArrayReverseArrayCharApproach2 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the size of array: ");
                int size = s.nextInt();

                char originalArr[] = new char[size];

                System.out.println("Enter the elements: ");
                for (int i = 0; i < originalArr.length; i++) {
                        originalArr[i] = s.next().charAt(0);
                }

                char reversedArr[] = ReverseArrayCharApproach2.reverse(originalArr);

                System.out.println("Original Array: ");
                for (int i = 0; i < originalArr.length; i++) {
                        System.out.print(originalArr[i] + " ");
                }

                System.out.println();
                System.out.println("Reversed Array: ");
                for (int i = 0; i < reversedArr.length; i++) {
                        System.out.print(reversedArr[i] + " ");
                }

                s.close();
        }
}
