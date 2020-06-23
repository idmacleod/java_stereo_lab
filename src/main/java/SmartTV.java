public class SmartTV implements IConnect {
    public String connect(Stereo stereo) {
        stereo.connectDevice(this);
        return stereo.getName();
    }
}
