public class Heart extends Organ{
    private int bpm;

    public Heart(String name, String condition, int bpm) {
        super(name, condition);
        this.bpm = bpm;
    }

    public int getBpm() {
        return this.bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    

}
