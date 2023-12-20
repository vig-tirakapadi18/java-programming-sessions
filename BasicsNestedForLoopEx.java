public class BasicsNestedForLoopEx {
        public static void main(String[] args) {
                for (int i = 1; i <= 3; i++) {
                        System.out.println(i);
                        for (int j = 1; j <= 3; j++) {
                                if (i == 2) {
                                        break;
                                }
                                System.out.println(j);
                                System.out.println("KodNest");
                        }
                }
        }
}
