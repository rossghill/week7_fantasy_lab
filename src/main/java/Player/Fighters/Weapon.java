package Player.Fighters;

public enum Weapon {

    SWORD(50),
    CLUB(30),
    AXE(100);


    private final int value;

    Weapon(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
