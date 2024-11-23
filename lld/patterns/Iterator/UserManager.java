package dsalld.lld.patterns.Iterator;
import java.util.*;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    IteratorI getIterator(){
        return new IteratorIImple(users);
    }



}
