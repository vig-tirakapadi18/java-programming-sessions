class Calculator {
        public void add() {
                int a = 10;
                int b = 20;
                int c = a + b;
                System.out.println(c);
        }

        public void sub(int a, int b) {
                int c = a + b;
                System.out.println(c);
        }

        public int mul() {
                int a = 10;
                int b = 20;
                int c = a * b;
                return c;
        }

        public int div(int a, int b) {
                int c = a / b;
                return c;
        }
}

public class NumbersTypesOfMethods {
        public static void main(String[] args) {
                Calculator calc = new Calculator();
                calc.add();
                calc.sub(20, 10);
                int mulRes = calc.mul();
                System.out.println(mulRes);
                int divRes = calc.div(20, 10);
                System.out.println(divRes);
        }
}
