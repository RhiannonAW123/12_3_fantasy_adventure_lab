package enemiesTest;

import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    Troll troll;

    @Before
    public void before(){
        troll = new Troll(35);
    }

    @Test
    public void hasHp(){
        assertEquals(35, troll.getHp());
    }



}
