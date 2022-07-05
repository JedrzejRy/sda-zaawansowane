package obiektowe.powtorka.postOffice;

import java.util.Scanner;

public class Post {
    double earnings = 0;
    Letter[] letters = new Letter[10];

    public double sendAPackage(Package package1, double money) {
        if (money >= package1.priceTag(package1.getWeight(), package1.isPriority())) {
            package1.setStatus("Send");
            earnings += package1.priceTag(package1.getWeight(), package1.isPriority());
            return money - package1.priceTag(package1.getWeight(), package1.isPriority());
        } else {
            System.out.println("Insufficient Funds");
            return money;
        }
    }

    public double sendALetter(Letter letter, double money) {
        if (money >= letter.price()) {
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == null) {
                    letters[i] = letter;
                    return money - letter.price();

                }
            }
        }
        System.out.println("the post office can only send 10 letters a day");
        return money;
    }

    public Package createAPackage() {
        Scanner scanner = new Scanner(System.in);
        return new Package(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
    }


    public void sendAllLetters() {
        for (Letter letter : letters) {
            if (letter == null){
                return;
            }
                letter.changeStatusToSend();
        }
    }
}

