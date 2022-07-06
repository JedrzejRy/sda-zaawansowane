package obiektowe.inheritance.interfaces.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyMember daughter = new Daughter("Elizabeth");
        FamilyMember son = new Son("John");
        FamilyMember mother = new Mother("Emily");
        FamilyMember father = new Father("Frank");
        FamilyMember aunt = new Aunt();

        List<FamilyMember> familyMemberList = new ArrayList<>();
        familyMemberList.add(daughter);
        familyMemberList.add(son);
        familyMemberList.add(mother);
        familyMemberList.add(father);
        familyMemberList.add(aunt);

        for (FamilyMember c :familyMemberList){
            c.introduceYourself();
            System.out.println(c.isAdult());
        }


    }
}
