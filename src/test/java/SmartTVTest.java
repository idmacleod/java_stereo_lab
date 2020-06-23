import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartTVTest {
    private SmartTV smartTV;
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
        smartTV = new SmartTV();
    }

    @Test
    public void canConnect() {
        assertEquals("Val's Stereo", smartTV.connect(stereo));
    }
}