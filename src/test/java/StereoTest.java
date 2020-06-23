import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void canGetVolume() {
        assertEquals(5, stereo.getVolume());
    }

    @Test
    public void canTuneRadio() {
        assertEquals("Radio tuned to Radio 1", stereo.tuneRadio("Radio 1"));
    }

    @Test
    public void canPlayRecord() {
        stereo.playRecord();
        assertTrue(stereo.recordDeck().isPlaying());
        assertFalse(stereo.cdDeck().isPlaying());
    }

    @Test
    public void canPlayCd() {
        stereo.cdDeck().addCd("The White Album");
        stereo.playCd();
        assertTrue(stereo.cdDeck().isPlaying());
        assertFalse(stereo.recordDeck().isPlaying());
    }

    @Test
    public void canIncreaseVolume() {
        stereo.volumeUp();
        assertEquals(6, stereo.getVolume());
    }

    @Test
    public void canLowerVolume() {
        stereo.volumeDown();
        assertEquals(4, stereo.getVolume());
    }

    @Test
    public void volumeCannotBeHigherThan10() {
        stereo.volumeUp();
        stereo.volumeUp();
        stereo.volumeUp();
        stereo.volumeUp();
        stereo.volumeUp();
        stereo.volumeUp();
        assertEquals(10, stereo.getVolume());
    }

    @Test
    public void volumeCannotBeLowerThan0() {
        stereo.volumeDown();
        stereo.volumeDown();
        stereo.volumeDown();
        stereo.volumeDown();
        stereo.volumeDown();
        stereo.volumeDown();
        assertEquals(0, stereo.getVolume());
    }
}
