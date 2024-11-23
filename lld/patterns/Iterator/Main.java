package dsalld.lld.patterns.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator Method");
        UserManager um = new UserManager();
        um.addUser(new User("A", "1"));
        um.addUser(new User("B", "2"));
        um.addUser(new User("C", "3"));
        um.addUser(new User("D", "4"));
        um.addUser(new User("E", "5"));

        IteratorI iterator = um.getIterator();
        while(iterator.hasNext()){
            User user = (User)iterator.next();
            System.out.println("Name: "+user.getName()+" UID: "+user.getUid());
        }



    }
}
