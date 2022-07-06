package obiektowe.inheritance.interfaces.task1;

public class Daughter implements FamilyMember {
    private String name;

    public Daughter(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("I am daughter " + name);
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
