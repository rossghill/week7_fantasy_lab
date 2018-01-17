package Player.Clerics;

public enum HealingTool {

    HERBS(50),
    POTION(100),
    ELIXIR(200);

    private final int value;

        HealingTool(int value) {
        this.value = value;
        }

        public int getValue() {
            return this.value;
        }

}

