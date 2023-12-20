import java.util.Scanner;

class BasicsSwitch {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);

                System.out.println("Enter number between 1-4: ");
                int num = s.nextInt();

                switch (num) {
                        case 1:
                                System.out.println("ONE");
                                break;
                        case 2:
                                System.out.println("TWO");
                                break;
                        case 3:
                                System.out.println("THREE");
                                break;
                        case 4:
                                System.out.println("FOUR");
                                break;
                        default:
                                System.out.println("Invalid Choice!");
                }
                s.close();
        }
}