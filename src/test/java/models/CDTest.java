package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/9/18.
 */
public class CDTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        CD.clearAllCDs();
    }

    @Test
    public void AddedCDAreLogged() {
        CD cd = new CD("Britney Spears");
        CD nextCD = new CD ("Backstreet Boys");
        assertEquals(2, CD.getAllCD().size());
    }
}