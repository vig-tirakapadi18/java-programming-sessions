public class BasicsLabelledForLoop {
        public static void main(String[] args) {
                outer: for (int i = 1; i <= 3; i++) {
                        System.out.println(i);

                        inner: for (int j = 1; j <= 3; j++) {
                                System.out.println("KodNest");
                                break outer;
                        }
                }
        }
}
