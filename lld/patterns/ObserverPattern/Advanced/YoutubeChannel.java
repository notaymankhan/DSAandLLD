package dsalld.lld.patterns.ObserverPattern.Advanced;
import java.util.*;

public class YoutubeChannel implements Subject{

    List<Observer> subscribersList = new ArrayList<>();
    String title ;
    @Override
    public void subscribe(Observer ob) {
        subscribersList.add(ob);


    }

    @Override
    public void unsubscribe(Observer ob) {
        subscribersList.remove(ob);

    }

    @Override
    public void uploadVideo(String title) {
        this.title = title;
        notifySubscribers(title);


    }

    public void notifySubscribers(String title){
        for(Observer ob: subscribersList){
            ob.update(title);
        }
    }
}
