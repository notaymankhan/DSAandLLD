package dsalld.aymanjava;


class C1{
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void printdetails(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
        System.out.println("a = "+a);
    }
}

class Ay extends C1{

    void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
//         System.out.println(a); // a is private
    }

}

public class cwh_13_access_modifers {
    public static void main(String[] args) {
        Ay a =new Ay();
        a.meth1();
    }
}
