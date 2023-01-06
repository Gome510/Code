public class Stomach extends Organ{
    private boolean hungry;

    public Stomach(String name, String condition, boolean hungry) {
        super(name, condition);
        this.hungry = hungry;
    }

    public boolean isHungry() {
        return this.hungry;
    }

    public boolean getHungry() {
        return this.hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

}