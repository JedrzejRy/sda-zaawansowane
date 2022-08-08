package obiektowe.functionalProgramming.task31;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Person {
    private String name;
    private LocalDate birthday;
    private List<Pet> pets;

    public Person(String name, LocalDate birthday, List<Pet> pets) {
        this.name = name;
        this.birthday = birthday;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<Pet> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", pets=" + pets +
                '}';
    }
}
