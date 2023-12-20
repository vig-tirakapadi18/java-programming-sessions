import java.util.Scanner;

class ReverseEachWordInString {
        public static String reverseEachWord(String originalStr) {
                String originalStrWords[] = originalStr.split(" ");
                String reversedStr = "";

                for (String word : originalStrWords) {
                        char wordChars[] = word.toCharArray();
                        char reversedWordChars[] = new char[wordChars.length];

                        for (int i = 0; i < wordChars.length; i++) {
                                reversedWordChars[wordChars.length - i - 1] = wordChars[i];
                        }

                        String reversedWord = new String(reversedWordChars);
                        reversedStr = reversedStr + reversedWord + " ";
                        // reversedStr.trim();
                }

                return reversedStr;
        }
}

public class StringReverseEachWordInString {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a string to reverse it word by word: ");
                String originalStr = s.nextLine();

                String reversedStr = ReverseEachWordInString.reverseEachWord(originalStr);
                System.out.println("Original String: " + originalStr);
                System.out.println("Reversed String: " + reversedStr);

                s.close();
        }
}
