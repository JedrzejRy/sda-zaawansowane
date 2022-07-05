package obiektowe.powtorka.postOffice;

public class Package {
    private String sender;
    private String receiver;
    private double weight;
    private boolean priority;
    private String status = "Created";

    public Package(String sender, String receiver, double weight) {
        if (sender.isEmpty() || receiver.isEmpty()) {
            System.out.println("Sender or receiver is not defined");
            return;
        }
        if (weight < 1 || weight > 100_000) {
            System.out.println("incorrect weight");
            return;
        }
        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
    }

    public Package() {
        Randomizer randomizer = new Randomizer();
        this.sender = randomizer.randomSender();
        this.receiver = randomizer.randomReceiver();
        this.weight = randomizer.randomWeight();
        this.priority = randomizer.randomPriority();
    }


    double priceTag(double weight, boolean priority) {
        double price = 0;
        if (weight < 0.5) {
            price = 5;
        } else if (weight > 0.5 && weight <= 1) {
            price = 8;
        } else if (weight > 1 && weight <= 2) {
            price = 12;
        } else if (weight > 2) {
            price = 12 + (weight - 2);
            price = Math.round(price);
        }
        if (priority){
            price *= 1.1;
            price = Math.round(price);
        }
        return price;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isPriority() {
        return priority;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Package{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", weight=" + weight +
                ", priority=" + priority +
                ", status='" + status + '\'' +
                '}';
    }
}
