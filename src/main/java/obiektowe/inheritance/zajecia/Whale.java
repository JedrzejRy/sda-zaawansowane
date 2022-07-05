package obiektowe.inheritance.zajecia;

public class Whale extends Animal {
    private String name;
    private int age;
    private double weight;

    public Whale(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Whale() {
        name = "Kraken";
        age = 60;
        weight = 4.5;
    }

    public void booing(){
        System.out.println("<donosne buczenie wieloryba!>");
    }

    public void swim(){
        System.out.println(name + " plynie majestatycznie");
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println("czyli je plankton");
    }
}
