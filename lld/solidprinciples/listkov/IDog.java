package dsalld.lld.solidprinciples.listkov;

public interface IDog {

    public void bark();

//    since eat will not be proper for DummyDog, we can remove it from the interface and instead create 2 seperate interfaces IRealDog and IToyDog
//    public void eat();
}
