package obiektowe.powtorka.PostOffice;

public class Post {
    public double sendAPackage(Package package1, double money){
        if (money >= package1.priceTag(package1.getWeight(),package1.isPriority())){
            package1.setStatus("Send");
            return money - package1.priceTag(package1.getWeight(), package1.isPriority());
        }else {
            System.out.println("Insufficient Funds");
            return money;
        }
    }
}
