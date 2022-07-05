package obiektowe.inheritance.task2;

public abstract class Citizen {
    String name;

    public Citizen(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract boolean canVote();
}
