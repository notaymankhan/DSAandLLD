package dsalld.lld.patterns.singleton;

public class SimpleSingleton {
    private static final SimpleSingleton instance = new SimpleSingleton();
    private SimpleSingleton() {
        System.out.println("private constructor");
    }

    public static SimpleSingleton getInstance(){
        return instance;
    }
}

//we can also use static block to initialize the instance
class StaticSingleton{
    private StaticSingleton() {
        System.out.println("private constructor");
    }

    private static StaticSingleton instance;

    static{
        instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return instance;
    }

}

//we can use l;azy singleton to ensure that we are never instantiatiung twice we return the same instance even if two seperate threads are calling it at the same time

class LazySingleton{
    private LazySingleton(){
        System.out.println("private constructor");
    }
    private static LazySingleton instance;

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;

    }
}

///we can also ensure synchronised so that at any point in tiume only one thread can access this thread
// to avoid race condition we used synchronized keyword this is slow since wthe whole method is synchronised.
// Examples of usage are jbdc driver or file writer you dont want two seperate threads ccessing the instance at the same time

class SynchronisedSingleton{
    private static SynchronisedSingleton instance;

    private SynchronisedSingleton(){
        System.out.println("private constructor");
    }

    public static synchronized SynchronisedSingleton getInstance(){
        if(instance == null){
            instance = new SynchronisedSingleton();
        }
        return instance;
    }
}


//we can double check the instance to avoid synchronising the whole method

class OptimisedThreadSafeSingleton {
    private static OptimisedThreadSafeSingleton instance;

    private OptimisedThreadSafeSingleton() {
        System.out.println("private constructor");
    }

    public static OptimisedThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (OptimisedThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new OptimisedThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
//    Inside the synchronized block, the method checks again if instance is null.
//    This second check is necessary because another thread might have created the instance
//    while the current thread was waiting to enter the synchronized block.
//    If instance is still null, it creates a new instance.
}


//BillPugh

class BillPughSingleton {
    private BillPughSingleton() {
        System.out.println("private constructor");
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

//In this example:
//The BillPughSingleton constructor is private to prevent instantiation from outside the class.
//The SingletonHelper static inner class contains the instance of the BillPughSingleton.
//The getInstance method returns the instance from the SingletonHelper class.
//This approach ensures that the instance is created only when it is needed, and it is thread-safe without requiring synchronization.


