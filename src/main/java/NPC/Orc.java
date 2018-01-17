package NPC;

import Actions.IAttackable;

public class Orc extends Enemy implements IAttackable {

        public Orc(String name, int healthPoints) {
            super (name, healthPoints);
        }

    public int attack() {
        return 0;
    }
}
