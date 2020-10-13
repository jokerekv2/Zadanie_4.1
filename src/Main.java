public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        System.out.println(tv.showStatus());
        tv.turnOn(true);
        System.out.println(tv.showStatus());
        tv.turnOn(false);
        System.out.println(tv.showStatus());
    }
}
