package obiektowe.inheritance.zadanie;

public class Jaguar extends Animal {
    private String name;
    private int age;

    public Jaguar(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void roar(){
        System.out.println(name + " is Roaring!");
    }

    public void climb(){
        System.out.println(name + " is climbing the three!");
    }

    @Override
    public void goToSleep() {
        System.out.print(name);
        super.goToSleep();
    }
}
