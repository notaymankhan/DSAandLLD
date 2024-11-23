package dsalld.aymanjava;
class Phone{
    public void on(){
        System.out.println("Turning phone on");
    }
}

class SmartPhone extends Phone{

    public void swagat(){
        System.out.println("Aapka swagat he");
    }
    public void on(){
        System.out.println("Turning SmartPhone on");
    }
}
public class cwh_9_dynamicmethoddispatch {
    public static void main(String[] args) {
//        Phone nokia = new Phone();
//        SmartPhone samsung = new SmartPhone();
//        nokia.name();

        Phone obj = new SmartPhone();
        obj.on();

    }
}
