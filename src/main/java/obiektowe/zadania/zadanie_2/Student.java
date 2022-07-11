package obiektowe.zadania.zadanie_2;

import java.util.Date;

public class Student extends Person {
    private String subject;
    private int date;
    private int tuition;

    public Student(String subject, int date, int tuition) {
        this.subject = subject;
        this.date = date;
        this.tuition = tuition;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTuition() {
        return tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getAddress() + " " + "Student{" +
                "subject='" + subject + '\'' +
                ", date=" + date +
                ", tuition=" + tuition +
                '}';
    }
}
