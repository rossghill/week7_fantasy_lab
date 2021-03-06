package NPC;

import Actions.IAttackable;

public abstract class Enemy {

    private String name;
    private int healthPoints;

    public Enemy(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }


    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.healthPoints;
    }

    public void setHealth(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
