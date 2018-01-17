package Player;

import Actions.IAttackable;

import java.util.ArrayList;

public abstract class Player implements IAttackable{

    private String name;
    private int healthPoints;
    private ArrayList<Enum> inventory;

    public void Player(){
        this.name = name;
        this.healthPoints = healthPoints;
        this.inventory = new ArrayList<>();
    }


}
