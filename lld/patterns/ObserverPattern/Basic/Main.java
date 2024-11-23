package dsalld.lld.patterns.ObserverPattern.Basic;

public class Main {
    public static void main(String[] args) {
        System.out.println("starting observer patter ");
        Subject ch = new YoutubeChannel();
        Observer ayman = new Subscriber("ayman");
        Observer aswin = new Subscriber("aswin");
        Observer deepak = new Subscriber("deepak");

        ch.subcribe(ayman);
        ch.subcribe(aswin);
        ch.subcribe(deepak);

        ch.uploadVideo("Observer pattern");

    }
}
