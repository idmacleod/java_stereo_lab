import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordDeckTest {
    private RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck("Sony", "V500");
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("V500", recordDeck.getModel());
    }

    @Test
    public void newRecordDeckIsNotPlaying() {
        assertFalse(recordDeck.isPlaying());
    }

    @Test
    public void canPlay() {
        recordDeck.play();
        assertTrue(recordDeck.isPlaying());
    }

    @Test
    public void canStop() {
        recordDeck.play();
        recordDeck.stop();
        assertFalse(recordDeck.isPlaying());
    }
    
    @Test
    public void speedStartsMedium() {
        assertEquals(RecordDeck.Speed.MEDIUM, recordDeck.getSpeed());
    }

    @Test
    public void canChangeSpeed() {
        recordDeck.setSpeed(RecordDeck.Speed.FAST);
        assertEquals(RecordDeck.Speed.FAST, recordDeck.getSpeed());
    }
}
