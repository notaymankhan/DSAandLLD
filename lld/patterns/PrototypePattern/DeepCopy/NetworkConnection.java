package dsalld.lld.patterns.PrototypePattern.DeepCopy;
import java.util.*;


public class NetworkConnection implements Cloneable{
    private String ip;
    private String veryImportantData;

    private List<String> domains = new ArrayList<>();

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

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void addDomain(String domain){
        this.domains.add(domain);
    }

    public void loadVeryImportantData() throws InterruptedException{
        // Load very important data from the network
        setVeryImportantData("this is very veyr veyr veyr Very important data");
        Thread.sleep(5000);
    }

//    own logic for clone aka deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection clonedClass = new NetworkConnection();
        clonedClass.setIp(this.ip);
        clonedClass.setVeryImportantData(this.veryImportantData);
        for(String d : this.getDomains()){
            clonedClass.getDomains().add(d);
        }
        return clonedClass;
    }

    @Override
    public String toString() {
        return "recieved Data from ip: " + this.ip +" data recieved is "+ this.veryImportantData + " domains are "+ this.domains;
    }
}
