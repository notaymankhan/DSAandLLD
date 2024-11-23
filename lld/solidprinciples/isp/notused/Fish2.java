package dsalld.lld.solidprinciples.isp.notused;

public class Fish2 implements Animal2{
    @Override
    public void run() {
        throw new RuntimeException("Fish cannot run");
    }
    @Override
    public void fly() {
        throw new RuntimeException("Fish cannot fly");
    }
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }
}
