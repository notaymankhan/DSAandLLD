package dsalld.lld.patterns.ObserverPattern.Advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Advanced");
        Subject channel = new YoutubeChannel();
        Observer sub1 = new Subscriber("John");
        Observer sub2 = new Subscriber("Doe");
        Observer sub3 = new Subscriber("Alice");
        Observer sub4 = new Subscriber("Bob");
        Observer sub5 = new Subscriber("Charlie");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Enter 1 to upload a video");
            System.out.println("Enter 2 to subscribe a user");
            System.out.println("Enter 3 to unSubscriber a user");
            System.out.println("Enter 4 to exit");

            int c = Integer.parseInt(br.readLine());

            if(c==1){
//                logic for uploading a video
                System.out.println("Enter Video title");
                String videoTitle = br.readLine();
                channel.uploadVideo(videoTitle);
                System.out.println("Video Uploaded and people notified");
            }
            else if(c==2){
//                logic for subscribing a user
                System.out.println("Enter User Name");
                String name = br.readLine();
                Observer sub = new Subscriber(name);
                channel.subscribe(sub);
                System.out.println("User Subscribed");

            }
            else if(c==3){
//                logic for unsubscribing a user
                System.out.println("Enter user name you want to unsubscribe");
                String unSubName = br.readLine();
                Observer unsub = new Subscriber(unSubName);
                channel.unsubscribe(unsub);
                System.out.println("User Unsubscribed");

            }
            else if(c==4){
                break;

            }
            else{
                System.out.println("retry");


            }
        }

    }
}
