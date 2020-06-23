public class Stereo  {
    private String name;
    private Radio radio;
    private RecordDeck recordDeck;
    private CdDeck cdDeck;
    private int volume;
    private boolean powerOn;

    public Stereo(String name, Radio radio, RecordDeck recordDeck, CdDeck cdDeck){
        this.name = name;
        this.radio = radio;
        this.recordDeck  = recordDeck;
        this.cdDeck = cdDeck;
        this.volume  = 5;
        this.powerOn = false;
    }

    public String getName() {
        return name;
    }

    public Radio radio() {
        return radio;
    }

    public RecordDeck recordDeck() {
        return recordDeck;
    }

    public CdDeck cdDeck() {
        return cdDeck;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isPowerOn() {
        return powerOn;
    }
}
