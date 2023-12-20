class SumOf5Nums {
        public void sumOf5Nums() {
                int sum = 0;
                for (int i = 1; i <= 5; i++) {
                        sum = sum + i;
                }
                System.out.println("Sum of first 5 nums: " + sum);
        }
}

public class NumbersSumOfFirst5Nums {
        public static void main(String[] args) {
                SumOf5Nums s = new SumOf5Nums();
                s.sumOf5Nums();
        }
}
