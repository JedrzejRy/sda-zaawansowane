package obiektowe.typyWyliczeniowe;

public enum Rank {
    ACE(14),
    KING(13),
    QUEEN(12),
    JACK(11),
    X(10),
    IX(9),
    VIII(8),
    VII(7),
    VI(6),
    V(5),
    IV(4),
    III(3),
    II(2);

    private final int strength;

    Rank(int strength) {
        this.strength = strength;
    }

    public int getStrength(){
        return strength;
    }

}
