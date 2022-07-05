package obiektowe.inheritance.task1.klasy;

public class Jaguar extends Animal {


    public Jaguar(String name, int age) {
        super(name, age);
    }

    public void roar(){
        System.out.println(name + " is Roaring!");
    }

    public void climb(){
        System.out.println(name + " is climbing the tree!");
    }

    @Override
    public void goToSleep() {
        System.out.print(name);
        super.goToSleep();
    }

    @Override
    public void makeASound() {
        roar();
    }
}
