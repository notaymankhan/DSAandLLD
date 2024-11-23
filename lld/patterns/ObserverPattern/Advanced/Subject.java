package dsalld.lld.patterns.ObserverPattern.Advanced;

public interface Subject {

    public void subscribe(Observer ob);

    public void unsubscribe(Observer ob);

    public void uploadVideo(String title);

}
