package Player.Clerics;

import Player.Treasure;

import java.util.ArrayList;

public abstract class Clerics extends Player.Player{

    private HealingTool healingTool;

    public Clerics(String name, HealingTool healingTool, int healthPoints) {
        super(name, healthPoints);
        this.healingTool = healingTool;
    }

    public HealingTool getHealingTool() {
        return this.healingTool;
    }
}
