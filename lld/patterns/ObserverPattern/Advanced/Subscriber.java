package dsalld.lld.patterns.ObserverPattern.Advanced;

public class Subscriber implements Observer{

    String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String title) {
        System.out.println("Hey "+name+" New Video Uploaded: "+title);
    }

}
