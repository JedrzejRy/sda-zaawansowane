package obiektowe.zadania.zadanie_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person("James", "Honk 12");
        System.out.println(person);
        System.out.println(person2);

        Student student = new Student("Architecture",2022, 12000);
        student.setName("Kris");
        student.setAddress("HighStreet 11");

        Staff staff = new Staff("Teacher", 4000);
        staff.setName("Angel");
        staff.setAddress("Lowland 11");

        List<Person> list = new ArrayList<>();
        list.add(student);
        list.add(staff);
        for (Person c : list){
            System.out.println(c);
        }


    }
}
