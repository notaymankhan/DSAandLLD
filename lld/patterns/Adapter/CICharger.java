package dsalld.lld.patterns.Adapter;

public class CICharger implements AppleCharger {
    @Override
    public void chargeApple() {
        System.out.println("Charging Apple with CI Charger");
    }
}
