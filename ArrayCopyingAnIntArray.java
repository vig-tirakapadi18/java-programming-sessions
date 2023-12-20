import java.util.Scanner;

class CopyingAnIntArray {
        public static int[] copy(int originalArr[]) {
                int copiedArr[] = new int[originalArr.length];
                // int j = 0;

                for (int i = 0; i <= originalArr.length - 1; i++) {
                        copiedArr[i] = originalArr[i];
                        // j++;
                }

                return copiedArr;
        }
}

public class ArrayCopyingAnIntArray {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the size of an array: ");
                int size = s.nextInt();

                int originalArr[] = new int[size];

                System.out.println("Enter the elements of an array: ");
                for (int i = 0; i < originalArr.length; i++) {
                        originalArr[i] = s.nextInt();
                }

                System.out.println("Original Array: ");
                for (int i = 0; i < originalArr.length; i++) {
                        System.out.print(originalArr[i] + " ");
                }

                int copiedArr[] = CopyingAnIntArray.copy(originalArr);

                System.out.println();
                System.out.println("Copied Array: ");
                for (int i = 0; i < copiedArr.length; i++) {
                        System.out.print(copiedArr[i] + " ");
                }

                s.close();
        }
}