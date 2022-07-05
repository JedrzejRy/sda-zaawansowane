package obiektowe.inheritance.task1.klasy;

public class Goose extends Animal {


    public Goose(String name, int age) {
        super(name, age);
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

    @Override
    public void makeASound() {
        honk();
    }
}
