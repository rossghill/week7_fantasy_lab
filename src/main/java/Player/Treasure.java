package Player;


public enum Treasure {

    GOLD(50),
    DIAMOND(300),
    KRYPTONITE(600);

    private final int value;

    Treasure(int value) {
        this.value = value;
    }

    public int getInventoryValue() {
        return this.value;
    }

}