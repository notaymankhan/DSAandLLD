package dsalld.lld.patterns.Adapter;

public class SamsungCharger implements AndroidCharger{
    @Override
    public void chargeAndroid() {
        System.out.println("Charging Android with Samsung Charger");
    }
}
