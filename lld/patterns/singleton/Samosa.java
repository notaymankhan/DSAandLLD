package dsalld.lld.patterns.singleton;

import java.io.Serializable;

public class Samosa implements Serializable ,Cloneable {
//    basic method eager method
//    private static Samosa samosa = new Samosa();
//    private Samosa(){
//        System.out.println("Samosa is ready");
//    }
//
//    public static Samosa getSamosa(){
//        return samosa;
//    }

//    because we dont want object to be created again and again
//    private Samosa(){
//        System.out.println("private constructor");
//    }
//    private static Samosa samosa;
//
////    lazy way of creating
//    public static Samosa getSamosa(){
//        if(samosa == null){
//            samosa = new Samosa();
//        }
//
//        return samosa;
//
//    }

//    But the above doesnt think about multi threaded environment

//    private static Samosa samosa;
//
//    private Samosa(){
//        System.out.println("private constructor");
//    }
//
////    ensures only 1 thread can access the getSamosa method at a time
////    but even this is wrong as we only want one block of code to be
////    synchronised and not everything and it slows us down
//
//
////    public static synchronized Samosa getSamosa(){
////        if(samosa == null){
////            samosa = new Samosa();
////        }
////
////        return samosa;
////
////    }
//    public static Samosa getSamosa(){
//
//        if(samosa == null){
//            synchronized(Samosa.class){
//                if(samosa == null){
//                    samosa = new Samosa();
//                }
//            }
//        }
//        return samosa;
//    }

//    saving singleton pattern from breakers

    private static Samosa samosa;
    private Samosa(){
        System.out.println("private constructor");
        if(samosa!=null){
            throw new RuntimeException("You are trying to break singleton pattern");
        }
    }

    public static Samosa getSamosa(){

        if(samosa == null){
            synchronized(Samosa.class){
                if(samosa == null){
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }



    public Object readResolve(){
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return samosa;
    }



}
