package dsalld.lld.patterns.ObserverPattern.Basic;

public interface Subject {
    public void subcribe(Observer ob);
    public void unsubcribe(Observer ob);
    public void uploadVideo(String title);


}
