package dsalld.lld.solidprinciples.listkov;

public class RealDog implements IRealDog {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
