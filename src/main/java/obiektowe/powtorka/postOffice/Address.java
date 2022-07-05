package obiektowe.powtorka.postOffice;

public class Address {
    private String street;
    private int houseNumber;
    private String postCode;

    public Address(String street, int houseNumber, String postCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
