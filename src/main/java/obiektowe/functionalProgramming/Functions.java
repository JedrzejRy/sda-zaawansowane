package obiektowe.functionalProgramming;

public class Functions {
    public static void main(String[] args) {

        Equation addition = new Equation() {
            @Override
            public double evaluate(double number, double number2) {
                return number + number2;
            }
        };

        Equation subtraction = (double number, double number2) -> {
            return number - number2;
        };

        Equation multiplication = (num, num2) -> num * num2;

        System.out.println(addition.evaluate(10, 20));
        System.out.println(subtraction.evaluate(10,20));
        System.out.println(multiplication.evaluate(10,20));

    }


    interface Equation {
        public double evaluate(double number, double number2);
    }
}
