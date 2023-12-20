import java.util.Scanner;

class CheckIsCharPresent {
        public static void checkChar(String str, char ch) {
                char strChars[] = str.toCharArray();
                int temp = 0;

                for (int i = 0; i <= strChars.length - 1; i++) {
                        if (strChars[i] == ch) {
                                temp++;
                        }
                }

                if (temp > 0) {
                        System.out.println("The char " + ch + " is present in string (" + temp + " times)!");
                } else {
                        System.out.println("The char " + ch + " is NOT present in string!");
                }
        }
}

public class StringCheckIsCharPresent {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a string: ");
                String str = s.nextLine();
                System.out.println("Enter a char to check if it is present: ");
                char ch = s.next().charAt(0);

                CheckIsCharPresent.checkChar(str, ch);

                s.close();
        }
}
