package dsalld.lld.patterns.PrototypePattern.ShallowCopy;

public class Main{

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        System.out.println("starting prototype");
        NetworkConnection nc1 = new NetworkConnection();
        nc1.setIp("192.161.0.1");
        nc1.loadVeryImportantData();

        System.out.println(nc1);

        NetworkConnection nc2 = null;

        try{
            nc2 = (NetworkConnection)nc1.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println(nc2);

    }



}
