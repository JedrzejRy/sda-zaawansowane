package obiektowe.inheritance.task2;

public class King extends Citizen{

    public King(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }


}
