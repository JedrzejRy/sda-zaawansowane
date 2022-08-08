package obiektowe.functionalProgramming.challange1;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MyPerson extends Person{

    public MyPerson(String name) {
        super(name);
    }

    @Override
    protected int getRandomCash() {
        return new Random().nextInt(101);
    }

    @Override
    public LocalDate getRandomBirthDate() {
        long minDay = LocalDate.of(1950, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2015, 12, 31).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - getBirthDate().getYear();
    }
}
