package dsalld.aymanjava;

class A{
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am a method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am a method 2 of class B");
    }
}
public class cwh_8_methodoverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();

    }
}
