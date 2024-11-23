package dsalld.lld.solidprinciples.isp.used;

public class Duck implements LandAnimal,SeaAnimal,AirAnimal{
    @Override
    public void run(){
        System.out.println("Duck is running");
    }

    @Override
    public void walk(){
        System.out.println("Duck is walking");
    }

    @Override
    public void swim(){
        System.out.println("Duck is swimming");
    }

    @Override
    public void eat(){
        System.out.println("Duck is eating");
    }

    @Override
    public void fly(){
        System.out.println("Duck is flying");
    }


}
