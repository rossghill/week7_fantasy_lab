package NPC;

import Actions.IAttackable;

public class Troll extends Enemy implements IAttackable{

    public Troll(String name, int healthPoints) {
        super (name, healthPoints);
    }

//    public String attack() {
//        return super.attack();
//    }
}