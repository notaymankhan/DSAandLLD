package dsalld.aymanjava;

abstract class Parent{
    public Parent(){
        System.out.println("I am a parent constructor");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}

abstract class Child1 extends Parent{
    public void th(){
        System.out.println("Good night");
    }
//    @Override
//    public void greet(){
//        System.out.println("child 2 greets you");
//    }
}

class Child3 extends Child1{
    public void th(){
        System.out.println("Good night by child 3");
    }

    public void greet(){
        System.out.println("child 3 greets you");
    }
}
public class cwh_11_abstractc {

}
