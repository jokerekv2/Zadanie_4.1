public class Televisor {
    private boolean status = false;

    public void turnOn(boolean status){
        this.status = status;
    }

    public void turnOff(boolean status){
        this.status = status;
    }

    public boolean showStatus() {
        return status;
    }
}
