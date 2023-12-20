public class StringSomeInBuiltMethods {
        public static void main(String[] args) {
                String str1 = "VighnEsH";

                // Uppercase
                System.out.println(str1.toUpperCase());

                // Lowercase
                System.out.println(str1.toLowerCase());

                // Getting acharacter at specified index
                System.out.println(str1.charAt(5));

                // Getting the index of specified character
                System.out.println(str1.indexOf("g"));

                String str2 = "    Vig Vig Vig   ";

                // Removes leading & trailing white-space
                System.out.println(str2.trim());

                // Getting each words from the String
                String words[] = str2.split(" ");
                for (String word : words)
                        System.out.print(word + " | ");

                System.out.println();
                // Converting String into a Array of type char
                char letters[] = str2.toCharArray();
                for (char letter : letters)
                        System.out.print(letter + " | ");
        }
}
