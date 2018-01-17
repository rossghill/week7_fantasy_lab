package NPC;

import Actions.IAttackable;

public class Orc extends Enemy {

        public Orc(String name, int healthPoints) {
            super (name, healthPoints);
        }

    public int attack() {
        return 0;
    }
}
