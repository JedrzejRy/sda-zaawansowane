package obiektowe.powtorka.postOffice;

import java.util.Random;

public class Randomizer {

    private static final String[] senders = new String[]{"Jesse Reyes","Tony Barlow","Victor Tucker","Talia Steele","Minerva Grant", "Humbert Hunter","Len Stevenson"};
    private static final String[] receivers = new String[]{"Echo Hammond","Matilda Dittman","Christine Foster","Ollie Stanley","Ainsley Harvey", "Bond Gardner","Phoebe Cantrell"};
    private static final Random random = new Random();

    public  String randomSender(){
        int number = random.nextInt(7);
        return senders[number];
    }
    public  String randomReceiver(){
        int number = random.nextInt(7);
        return receivers[number];
    }

    public  double randomWeight(){
        return random.nextInt(100);
    }

    public  boolean randomPriority(){
        int number = random.nextInt(2);
        return number == 1;
    }
}
