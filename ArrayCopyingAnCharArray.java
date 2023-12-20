import java.util.Scanner;

class CopyingAnCharArray {
        public static char[] copy(char originalArr[]) {
                char copiedArr[] = new char[originalArr.length];

                for (int i = 0; i < originalArr.length; i++) {
                        copiedArr[i] = originalArr[i];
                }

                return copiedArr;
        }
}

public class ArrayCopyingAnCharArray {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the size of the array: ");
                int size = s.nextInt();

                char originalArr[] = new char[size];

                System.out.println("Enter the elements of an array: ");
                for (int i = 0; i < originalArr.length; i++) {
                        originalArr[i] = s.next().charAt(0);
                }

                char copiedArr[] = CopyingAnCharArray.copy(originalArr);

                System.out.println("Original Array: ");
                for (int i = 0; i < originalArr.length; i++) {
                        System.out.print(originalArr[i] + " ");
                }

                System.out.println();
                System.out.println("Copied Array: ");
                for (int i = 0; i < copiedArr.length; i++) {
                        System.out.print(copiedArr[i] + " ");
                }

                s.close();
        }
}
