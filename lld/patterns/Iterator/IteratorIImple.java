package dsalld.lld.patterns.Iterator;

import java.util.*;
import java.util.Iterator;

public class IteratorIImple implements IteratorI{

    List<User> users = new ArrayList<>();
    private int len;
    private int pos=0;

    public IteratorIImple(List<User> users){
        this.users = users;
        this.len = users.size();
    }

    @Override
    public boolean hasNext() {
        if(pos>=len){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        User u = users.get(pos);
        pos++;
        return u;
    }
}
