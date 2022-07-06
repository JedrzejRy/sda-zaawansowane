package obiektowe.inheritance.interfaces.task1;

public class Father implements FamilyMember{
    private String name;

    public Father(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("I am father " + name);
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
