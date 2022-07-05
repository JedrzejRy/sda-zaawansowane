package obiektowe.inheritance.task1.klasy;

public abstract class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void goToSleep() {
        System.out.println(" is going to sleep!");
    }

    public abstract void makeASound();
}
