package obiektowe.powtorka.postOffice;

public class Letter {
    private Address sendersAddress;
    private Address receiverAddress;
    private boolean priority;
    private String status = "Created";

    public Letter(Address sendersAddress, Address receiverAddress) {
        this.sendersAddress = sendersAddress;
        this.receiverAddress = receiverAddress;
    }

    public double price(){
        if (priority) {
            return 8.5;
        }
        return 6;
    }

    public void changeStatusToSend(){
        this.status = "Send";
    }

}
