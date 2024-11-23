package dsalld.lld.patterns.singleton;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import dsalld.lld.patterns.singleton.Samosa;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception,CloneNotSupportedException {

//        Samosa samosa1 = Samosa.getSamosa();
//        System.out.println(samosa1.hashCode());
//        Samosa samosa2 = Samosa.getSamosa();
//        System.out.println(samosa2.hashCode());

//        ways to break a single ton pattern 1
//        1.using a refelctiopn api
//        you can stop this by
//        a.if object is already present throw an exception from inside the constructor
//        b.or use enum
//        Samosa s1 = Samosa.getSamosa();
//        System.out.println(s1.hashCode());
//
//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());

//        2. Serialising Deserializing
//        we can solve this by implementing a public Object readResolve() method in the class
//
//        Samosa s1 = Samosa.getSamosa();
//        System.out.println(s1.hashCode());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(s1);
//        System.out.println("serilising done");
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa s2 = (Samosa) ois.readObject();
//        System.out.println("after deserializing");
//        System.out.println(s2.hashCode());


//        3.Cloning
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());
        Samosa s2 = (Samosa) s1.clone();
        System.out.println(s2.hashCode());




    }
}
