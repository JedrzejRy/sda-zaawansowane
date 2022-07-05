package obiektowe.inheritance.zadanie;

public class Goose extends Animal {
    private String name;
    private int age;

    public Goose(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void honk(){
        System.out.println(name + " is honking!");
    }

    public void fly(){
        System.out.println(name + " is flying!");
    }

    @Override
    public void goToSleep() {
        System.out.print(name);
        super.goToSleep();
    }
}
