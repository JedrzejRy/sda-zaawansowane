package obiektowe.powtorka.PostOffice;

import java.util.Scanner;

public class Post {
    double earnings = 0;

    public double sendAPackage(Package package1, double money){
        if (money >= package1.priceTag(package1.getWeight(),package1.isPriority())){
            package1.setStatus("Send");
            earnings += money - package1.priceTag(package1.getWeight(), package1.isPriority());
            return money - package1.priceTag(package1.getWeight(), package1.isPriority());
        }else {
            System.out.println("Insufficient Funds");
            return money;
        }
    }

    public Package createAPackage(){
        Scanner scanner = new Scanner(System.in);
        return new Package(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
    }
}
