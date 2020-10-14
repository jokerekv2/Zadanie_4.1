public class Televisor {
    private boolean status;

    public void turnOn(){
        status = true;
    }

    public void turnOff(){
        status = false;
    }

    public void showStatus() {
        System.out.println(status);
    }
}
