import java.util.Scanner;

public class Arrays1DTakeInputPrintOutput {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);

                // Strong "int" type of values
                System.out.println("Enter the length of Integer Array: ");
                int size = s.nextInt();

                int arr1[] = new int[size];

                System.out.println("Enter the elements: ");
                for (int i = 0; i <= arr1.length - 1; i++) {
                        System.out.println("Enter an element at " + i + " : ");
                        arr1[i] = s.nextInt();
                }

                System.out.println("Elements of an Integer Array are: ");
                for (int i = 0; i <= arr1.length - 1; i++) {
                        System.out.print(arr1[i] + " ");
                }

                System.out.println();
                // Storing "float" type of values
                System.out.println("Enter the length of Float Array: ");
                size = s.nextInt();

                float arr2[] = new float[size];

                System.out.println("Enter the elements for Float Array: ");
                for (int i = 0; i <= arr2.length - 1; i++) {
                        System.out.println("Enter the element at " + i + " : ");
                        arr2[i] = s.nextFloat();
                }

                System.out.println("Elements of a Float Array are: ");
                for (int i = 0; i <= arr2.length - 1; i++) {
                        System.out.print(arr2[i] + " ");
                }

                System.out.println();
                // Storing String type of values
                System.out.println("Enter the length of String Array: ");
                size = s.nextInt();

                String arr3[] = new String[size];

                System.out.println("Enter the elements for String Array: ");
                for (int i = 0; i <= arr3.length - 1; i++) {
                        System.out.println("Enter an element at " + i + " : ");
                        arr3[i] = s.next();
                }

                System.out.println("Elements of a String Array are: ");
                for (int i = 0; i <= arr3.length - 1; i++) {
                        System.out.print(arr3[i] + " ");
                }

                s.close();
        }
}