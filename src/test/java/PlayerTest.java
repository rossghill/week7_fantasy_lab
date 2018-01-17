import NPC.Orc;
import Player.Fighters.Barbarian;
import Player.Fighters.Dwarf;
import Player.Fighters.Knight;
import Player.Fighters.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Knight knight;
    Barbarian barbarian;
    Dwarf dwarf;

    @Before
    public void before(){
        knight = new Knight("Arthur", 400);
        barbarian = new Barbarian("Conan", 500);
        dwarf = new Dwarf("Gimmly", 350);
    }

    @Test
    public void hasName() {
        assertEquals("Arthur", knight.getName());
        assertEquals("Conan", barbarian.getName());
        assertEquals("Gimmly", dwarf.getName());
    }

    @Test
    public void knightCanAttackOrc() {
        Orc orc = new Orc("Mr. Orc", 400);
        knight.setWeapon(Weapon.SWORD);
        knight.attack(orc);
        assertEquals(350, orc.getHealth());

    }


}
