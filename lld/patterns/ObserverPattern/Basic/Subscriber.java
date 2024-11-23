package dsalld.lld.patterns.ObserverPattern.Basic;

public class Subscriber implements Observer{

    String name;

    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void notified(String title) {
        System.out.println("Hey "+ this.name + " New Video title: " + title + " is uploaded");
    }
}
