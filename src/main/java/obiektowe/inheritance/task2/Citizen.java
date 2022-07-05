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

    public boolean canVote(Citizen citizen){
        return citizen instanceof Townsman || citizen instanceof Soldier;
    }
}
