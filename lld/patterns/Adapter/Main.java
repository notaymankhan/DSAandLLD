package dsalld.lld.patterns.Adapter;

public class Main {
    public static void main(String[] args) {

        System.out.println("starting adapter pattern");

        AppleCharger ch = new CICharger();
        Iphone13 iphone13 = new Iphone13(ch);

        iphone13.chargeIphone();

        AndroidCharger andch = new SamsungCharger();
        AppleCharger adapter = new Adapter(andch);

        Iphone13 iphone13_2 = new Iphone13(adapter);
        iphone13_2.chargeIphone();

    }
}
