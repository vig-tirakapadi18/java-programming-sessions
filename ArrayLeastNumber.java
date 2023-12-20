import java.util.Scanner;

class LeastNumber {
        public static int findLeast(int arr[]) {
                int small = arr[0];
                for (int i = 1; i < arr.length; i++) {
                        if (arr[i] < small)
                                small = arr[i];
                }

                return small;
        }
}

public class ArrayLeastNumber {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the size of an array: ");
                int size = s.nextInt();

                int arr[] = new int[size];

                System.out.println("Enter the elements: ");
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = s.nextInt();
                }

                System.out.println("The elements entered of array: ");
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }

                System.out.println();
                int least = LeastNumber.findLeast(arr);
                System.out.println("The Least Number of an Array: " + least);

                s.close();
        }
}
