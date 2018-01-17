import NPC.Orc;
import NPC.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orc;
    Troll troll;


    @Before
    public void before(){
        this.orc = new Orc("Caeser", 300);
        this.troll = new Troll("Gorbachev", 200);
    }

    @Test
    public void enemyHasName(){
        assertEquals("Gorbachev", troll.getName());
        assertEquals("Caeser", orc.getName());
    }

    @Test
    public void enemyHasHealthPoints(){
        assertEquals(200, troll.getHealth());
        assertEquals(300, orc.getHealth());
    }

    @Test
    public void enemyCanAttack() {
        assertEquals(0, troll.attack());
        assertEquals(0, orc.attack());
    }
}
