package obiektowe.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int readNumber() {
        System.out.print("Podaj Numer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Input input = new Input();
        boolean test = true;

        while (test) {
            try {
                test = false;
                int number = input.readNumber();
            } catch (InputMismatchException e) {
                System.out.println("Zla zmienna!");
                test = true;
            }

        }
    }

}
