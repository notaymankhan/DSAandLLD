package dsalld.lld.patterns.Adapter;

public class Adapter implements AppleCharger {

    private AndroidCharger andch;

    public Adapter(AndroidCharger andch) {
        this.andch = andch;
    }
    @Override
    public void chargeApple() {
        andch.chargeAndroid();
    }
}
