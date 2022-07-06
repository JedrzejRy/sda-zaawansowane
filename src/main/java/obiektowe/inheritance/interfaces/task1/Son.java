package obiektowe.inheritance.interfaces.task1;

public class Son implements FamilyMember{
    private String name;

    public Son(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("I am son " + name);
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
