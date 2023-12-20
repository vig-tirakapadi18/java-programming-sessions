import java.util.Scanner;

class ReverseByPreservingSpace {
        public static String reverse(String originalStr) {
                char originalStrChars[] = originalStr.toCharArray();
                char reversedStrChars[] = new char[originalStrChars.length];

                int j = reversedStrChars.length - 1;

                for (int i = 0; i <= originalStrChars.length - 1; i++) {
                        if (originalStrChars[i] == ' ') {
                                reversedStrChars[i] = originalStrChars[i];
                        }
                }

                for (int i = 0; i <= originalStrChars.length - 1; i++) {
                        if (originalStrChars[i] != ' ') {
                                if (reversedStrChars[j] == ' ') {
                                        j--;
                                }
                                reversedStrChars[j] = originalStrChars[i];
                                j--;
                        }
                }

                String reversedStr = new String(reversedStrChars);

                return reversedStr;
        }
}

public class StringReverseByPreservingSpace {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a String to reverse (By preserving white spaces): ");
                String originalStr = s.nextLine();

                String reversedStr = ReverseByPreservingSpace.reverse(originalStr);
                System.out.println("Original String: " + originalStr);
                System.out.println("Reversed String by Preserving White space: " + reversedStr);

                s.close();
        }
}
