package NPC;

import Actions.IAttackable;

public abstract class Enemy implements IAttackable{

    private String name;
    private int healthPoints;

    public Enemy(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String attack() {
        return null;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.healthPoints;
    }
}
