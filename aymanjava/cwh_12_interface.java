package dsalld.aymanjava;

interface Bicycle{
    void applyBrake(int dec);
    void speedUp(int inc);
}

interface HornBicycle{
    void blowHornk3g();
    void blowHornClassic();
}

class AvonCycle implements Bicycle,HornBicycle{
    int speed;
    public void applyBrake(int dec){
        speed = speed - dec;
        System.out.println("Applying Brake at rate of -"+dec);
    }
    public void speedUp(int inc){
        speed = speed + inc;
        System.out.println("Accelerating at rate of +"+inc);
    }

    public void blowHornk3g(){
        System.out.println("aha ha ha ha kabhi khushi kabhi gham");
    }

    public void blowHornClassic(){
        System.out.println("pee pee poo poo");
    }


    public AvonCycle(int s){
        this.speed = s;
    }
    public AvonCycle(){
        System.out.println("avon cycle created");
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int s){
        this.speed = s;
    }


}

public class cwh_12_interface {
    public static void main(String[] args) {

        AvonCycle a1 = new AvonCycle();
        a1.setSpeed(10);
        a1.applyBrake(1);
        System.out.println(a1.getSpeed());
    }
}
