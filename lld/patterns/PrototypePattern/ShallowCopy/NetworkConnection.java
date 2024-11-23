package dsalld.lld.patterns.PrototypePattern.ShallowCopy;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String veryImportantData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getVeryImportantData() {
        return veryImportantData;
    }

    public void setVeryImportantData(String veryImportantData) {
        this.veryImportantData = veryImportantData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        // Load very important data from the network
        setVeryImportantData("this is very veyr veyr veyr Very important data");
        Thread.sleep(5000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "recieved Data from ip: " + this.ip +" data recieved is "+ this.veryImportantData;
    }
}
