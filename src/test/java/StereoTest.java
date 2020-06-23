import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StereoTest {
    private Stereo stereo;
    private Radio radio;
    private RecordDeck recordDeck;
    private CdDeck cdDeck;

    @Before
    public void before() {
        radio = new Radio("Sony", "RX100");
        recordDeck = new RecordDeck("Sony", "V500");
        cdDeck = new CdDeck("Sony", "C800i", 3);
        stereo = new Stereo("Val's Stereo", radio, recordDeck, cdDeck);
    }

    @Test
    public void hasName() {
        assertEquals("Val's Stereo", stereo.getName());
    }

    @Test
    public void hasRadio() {
        assertEquals(radio, stereo.radio());
    }

    @Test
    public void hasRecordDeck() {
        assertEquals(recordDeck, stereo.recordDeck());
    }

    @Test
    public void hasCdDeck() {
        assertEquals(cdDeck, stereo.cdDeck());
    }

    @Test
    public void powerOffAtStart(){
        assertFalse(stereo.isPowerOn());
    }

    @Test
    public void canGetVolume(){
        assertEquals(5, stereo.getVolume());
    }

    @
}
