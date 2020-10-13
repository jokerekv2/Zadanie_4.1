public class Televisor {
    private boolean status = false;

    public void turnOn(){
        status = true;
    }

    public void turnOff(){
        status = false;
    }

    public boolean showStatus() {
        return status;
    }
}
