package obiektowe.inheritance.interfaces.task1;

public class Mother implements FamilyMember{
   private String name;

    public Mother(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("I am mother " + name);
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
