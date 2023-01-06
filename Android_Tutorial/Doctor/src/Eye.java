public class Eye extends Organ{
    private boolean closed;

    public Eye(String name, String condition, boolean closed) {
        super(name, condition);
        this.closed = closed;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public boolean getClosed() {
        return this.closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }    

}