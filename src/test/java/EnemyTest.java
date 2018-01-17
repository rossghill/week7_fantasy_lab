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
    public void orcHasName(){
        assertEquals("Caeser", orc.getName());
    }

    @Test
    public void orcHasHealthPoints(){
        assertEquals(300, orc.getHealth());
    }
}
