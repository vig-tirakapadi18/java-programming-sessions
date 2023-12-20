import java.util.Scanner;

class ReverseArrayIntApproach1 {
        public static int[] reverseArray(int originalArr[]) {
                int reverseArr[] = new int[originalArr.length];
                int j = reverseArr.length - 1;

                for (int i = 0; i <= originalArr.length - 1; i++) {
                        reverseArr[j] = originalArr[i];
                        j--;
                }

                return reverseArr;
        }
}

public class ArraysReverseArrayIntApproach1 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the size of an Array: ");
                int size = s.nextInt();

                int originalArr[] = new int[size];

                System.out.println("Enter the elements in Array: ");
                for (int i = 0; i <= originalArr.length - 1; i++) {
                        originalArr[i] = s.nextInt();
                }

                int reverseArr[] = ReverseArrayIntApproach1.reverseArray(originalArr);

                System.out.println("Original Array Elements: ");
                for (int i = 0; i <= originalArr.length - 1; i++) {
                        System.out.print(originalArr[i] + " ");
                }

                System.out.println("Reversed Array Elements: ");
                for (int i = 0; i <= reverseArr.length - 1; i++) {
                        System.out.print(reverseArr[i] + " ");
                }

                s.close();
        }
}
