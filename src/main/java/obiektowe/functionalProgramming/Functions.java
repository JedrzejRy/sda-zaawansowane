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
        System.out.println(subtraction.evaluate(10, 20));
        System.out.println(multiplication.evaluate(10, 20));

        TextManipulator whisperer = text -> text.toLowerCase() + "...";

        System.out.println(whisperer.change("AAAAAAAAAAAAAAA"));


    }


    //Supplier - nic nie bierze coś zwraca
    //Consumer - coś bierze nic nie zwraca
    //Function - coś przyjmie coś zwraca (może być inny typ)
    //Operator - przyjmie to samo co zwraca
    //Predicate - coś przyjmie zwraca boolean
    //Comparator - przyjmie 2 rzeczy zwraca int
    //ActionListener - przyjme event, nic nie zwraca
    //Runnable - nic nie przyjmie, nic nie zwraca


    interface Equation {
        public double evaluate(double number, double number2);
    }


    interface TextManipulator {
        String change(String text);
    }
}
