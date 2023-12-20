import java.util.Scanner;

class GreatestNumber {
        public static int findGreatest(int arr[]) {
                int big = arr[0];
                for (int i = 1; i <= arr.length - 1; i++) {
                        if (arr[i] > big) {
                                big = arr[i];
                        }
                }

                return big;
        }
}

public class ArrayGreatestNumber {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the size of an array: ");
                int size = s.nextInt();

                int arr[] = new int[size];

                System.out.println("Enter the elements: ");
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = s.nextInt();
                }

                System.out.println("The elements present in array: ");
                for (int i = 0; i <= arr.length - 1; i++) {
                        System.out.print(arr[i] + " ");
                }

                System.out.println();
                int big = GreatestNumber.findGreatest(arr);
                System.out.println("The Greatest Number of in an Array is: " + big);

                s.close();
        }
}
