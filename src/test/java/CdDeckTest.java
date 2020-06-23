import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class CdDeckTest {
    private CdDeck cdDeck;

    @Before
    public void before() {
        cdDeck = new CdDeck("Sony", "C800i", 3);
    }

    @Test
    public void hasMake() {
        assertEquals("Sony",cdDeck.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("C800i", cdDeck.getModel());
    }

    @Test
    public void hasCapacity() {
        assertEquals(3, cdDeck.getCapacity());
    }

    @Test
    public void newCdDeckIsNotPlaying() {
        assertFalse(cdDeck.isPlaying());
    }

    @Test
    public void canPlay() {
        cdDeck.addCd("The White Album");
        cdDeck.play();
        assertTrue(cdDeck.isPlaying());
    }

    @Test
    public void cannotPlayIfCdDeckEmpty() {
        cdDeck.play();
        assertFalse(cdDeck.isPlaying());
    }

    @Test
    public void canStop() {
        cdDeck.play();
        cdDeck.stop();
        assertFalse(cdDeck.isPlaying());
    }

    @Test
    public void cdsStartsEmpty() {
        assertEquals(0, cdDeck.countCds());
    }

    @Test
    public void canAddCd() {
        cdDeck.addCd("The White Album");
        assertEquals(1, cdDeck.countCds());
    }

    @Test
    public void canRemoveCd() {
        cdDeck.addCd("The White Album");
        cdDeck.addCd("Nevermind");
        cdDeck.removeCd("The White Album");
        assertEquals(1, cdDeck.countCds());
    }
}
