import Player.Clerics.Cleric;
import Player.Clerics.HealingTool;
import Player.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before() {
        cleric = new Cleric("John the 1st", HealingTool.ELIXIR, 800);
    }

    @Test
    public void hasElixir() {
        assertEquals(HealingTool.ELIXIR, cleric.getHealingTool());
    }

    @Test
    public void hasName() {
        assertEquals("John the 1st", cleric.getName());
    }

    @Test
     public void hasHealthPoints() {
        assertEquals(800, cleric.getHealthPoints());
    }

    @Test
    public void canAddTreasure() {
        cleric.pickUpTreasure(Treasure.GOLD);
        assertEquals(1, cleric.inventoryCount());
    }

    @Test
    public void goldHasValue(){
        assertEquals(50, Treasure.GOLD.getInventoryValue());

    }

    @Test
    public void totalInventoryValue(){
        cleric.pickUpTreasure(Treasure.GOLD);
        cleric.pickUpTreasure(Treasure.KRYPTONITE);
      assertEquals(650, cleric.getTotalInventoryValue());
    }


}
