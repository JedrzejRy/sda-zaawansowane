package obiektowe.zadania.zadanie_2;

public class Staff extends Person {
    String specialization;
    int income;

    public Staff(String specialization, int income) {
        this.specialization = specialization;
        this.income = income;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getAddress() + " " +  "Staff{" +
                "specialization='" + specialization + '\'' +
                ", income=" + income +
                '}';
    }

}
