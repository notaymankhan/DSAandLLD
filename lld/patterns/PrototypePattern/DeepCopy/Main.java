package dsalld.lld.patterns.PrototypePattern.DeepCopy;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        System.out.println("starting prototype");
        NetworkConnection nc1 = new NetworkConnection();
        nc1.setIp("192.168.0.1");
        nc1.loadVeryImportantData();
        List<String> domains = new ArrayList<>();
        nc1.setDomains(domains);
        nc1.addDomain("google.com");
        nc1.addDomain("facebook.com");
        nc1.addDomain("youtube.com");
        nc1.addDomain("yahoo.com");
        nc1.addDomain("amazon.com");
        System.out.println(nc1);


        try{
            NetworkConnection nc2 = (NetworkConnection)nc1.clone();
            NetworkConnection nc3 = (NetworkConnection)nc1.clone();
            nc1.getDomains().removeLast();
            System.out.println(nc1);
            System.out.println(nc2);
            System.out.println(nc3);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }


    }
}
