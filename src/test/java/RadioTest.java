import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    private Radio radio;

    @Before
    public void before() {
        radio = new Radio("Sony", "RX100");
    }

    @Test
    public void canTune() {
        assertEquals("Tuned to Radio 1", radio.tune("Radio 1"));
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("RX100", radio.getModel());
    }
}
