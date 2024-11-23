package dsalld.lld.solidprinciples.isp.used;

public class Fish implements SeaAnimal{
    @Override
    public void eat(){
        System.out.println("Fish is eating");
    }
    @Override
    public void swim(){
        System.out.println("Fish is swimming");
    }
}
