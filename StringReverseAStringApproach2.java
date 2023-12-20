import java.util.Scanner;

class ReverseAStringApproach2 {
        public static String reverseString(String originalStr) {
                char originalStrChars[] = originalStr.toCharArray();
                char reversedStrChars[] = new char[originalStrChars.length];

                for (int i = 0; i < originalStrChars.length; i++) {
                        reversedStrChars[originalStrChars.length - i - 1] = originalStrChars[i];
                }

                String reversedStr = new String(reversedStrChars);

                return reversedStr;
        }
}

public class StringReverseAStringApproach2 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a String to reverse: ");
                String originalStr = s.nextLine();

                String reversedStr = ReverseAStringApproach2.reverseString(originalStr);

                System.out.println("Original String: " + originalStr);
                System.out.println("Reversed String: " + reversedStr);

                s.close();
        }
}
