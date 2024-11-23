package dsalld.lld.patterns.ObserverPattern.Basic;
import java.util.*;

public class YoutubeChannel implements Subject{

    List<Observer> subscribers = new ArrayList<>();

    String title ;

    public void uploadVideo(String title){
        this.title = title;
        notifyChanges(title);
    }
    @Override
    public void subcribe(Observer ob) {
        subscribers.add(ob);

    }

    @Override
    public void unsubcribe(Observer ob) {
        subscribers.remove(ob);

    }

    public void notifyChanges(String title) {

        for(Observer o:subscribers){
            o.notified(title);
        }

    }
}
