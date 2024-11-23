package dsalld.aymanjava;

class Base1{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        setX(a);
        System.out.println("I am an overloaded constructor with value of x as: "+a);

    }
}

class Derived1 extends Base1{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    Derived1(){
//        super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int a,int b){
        super(a);
        setY(b);
        System.out.println("I am an overloaded constructor with value of y as: "+b);
    }
}

class DerivedChild extends Derived1{
    DerivedChild(){
        System.out.println("I am a derived child class constructor");
    }
    DerivedChild(int c){
        setZ(c);
        System.out.println("I am a derived child class constructor and value of z is "+z);
    }
    DerivedChild(int a,int b,int c){
        super(a,b);
        setZ(c);
        System.out.println("I am an overloaded constructor for grand child with value of z as: "+z);
    }

    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

}

public class cwh_7_constructorsinheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1(10,20);
//        DerivedChild dc = new DerivedChild(15,30,45);
        DerivedChild dc = new DerivedChild(100);

    }
}
