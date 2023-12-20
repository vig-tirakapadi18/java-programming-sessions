import java.util.Scanner;

class SumOfElements {
        public static int sumOfElements(int arr[]) {
                int sum = 0;
                for (int i = 0; i <= arr.length - 1; i++) {
                        sum = sum + arr[i];
                }

                return sum;
        }
}

public class ArraySumOfElements {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the size of array: ");
                int size = s.nextInt();

                int arr[] = new int[size];

                System.out.println("Enter the elements of an array: ");
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = s.nextInt();
                }

                int sum = SumOfElements.sumOfElements(arr);

                System.out.println("Original Array: ");
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }

                System.out.println();
                System.out.println("The sum of all the elements of an array: " + sum);

                s.close();
        }
}
