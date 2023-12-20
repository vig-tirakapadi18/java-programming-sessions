import java.util.Scanner;

class ReverseAStringApproach1 {
        public static String reverseString(String originalStr) {
                char originalStrChars[] = originalStr.toCharArray();
                char reversedStrChars[] = new char[originalStrChars.length];

                int j = originalStrChars.length - 1;

                for (int i = 0; i < originalStrChars.length; i++) {
                        reversedStrChars[j] = originalStrChars[i];
                        j--;
                }

                String reversedStr = new String(reversedStrChars);

                return reversedStr;
        }
}

public class StringReverseAStringApproach1 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the String to reverse: ");
                String originalStr = s.nextLine();

                String reversedString = ReverseAStringApproach1.reverseString(originalStr);

                System.out.println("Original String: " + originalStr);
                System.out.println("Reversed String: " + reversedString);

                s.close();
        }
}
