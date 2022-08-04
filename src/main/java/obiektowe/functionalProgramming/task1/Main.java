package obiektowe.functionalProgramming.task1;

public class Main {
    public static void main(String[] args) {

        Operation addition = new Operation() {
            @Override
            public int evaluate(int number, int number2) {
                return number + number2;
            }
        };

        Operation subtraction = (num, num2) -> num - num2;

        System.out.println(addition.evaluate(15, 10));
        System.out.println(subtraction.evaluate(15,10));


    }


    interface Operation{
        public int evaluate (int number,int number2);
    }
}
