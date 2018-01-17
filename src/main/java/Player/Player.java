package Player;


import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int healthPoints;
    private ArrayList<Treasure> inventory;


    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.inventory = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void pickUpTreasure(Treasure treasure){
        this.inventory.add(treasure);
    }

    public int inventoryCount(){
        return this.inventory.size();
    }

    public int getTotalInventoryValue() {
        int total = 0;
        for (Treasure treasure : this.inventory) {
            total += treasure.getInventoryValue();
        }
        return total;
    }
}
