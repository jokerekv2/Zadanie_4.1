public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        System.out.println(tv.showStatus());
        tv.turnOn();
        System.out.println(tv.showStatus());
        tv.turnOff();
        System.out.println(tv.showStatus());
    }
}
