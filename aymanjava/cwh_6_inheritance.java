package dsalld.aymanjava;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base and setting x now where x= "+x);
        this.x = x;
    }

    Base(){
        System.out.println("I am a constructor");
    }

    public void printMe(){
        System.out.println("I am a method");
    }

}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    Derived() {
        System.out.println("I am a derived class constructor");
    }
}
public class cwh_6_inheritance{
    public static void main(String[] args) {
//        Base b = new Base();
        Derived b = new Derived();
        b.setX(4);
        System.out.println(b.getX());

    }

    }

