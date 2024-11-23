package dsalld.lld.solidprinciples.listkov;

public class DummyDog implements IToyDog {
    public DummyDog() {
    }

    @Override
    public void bark() {
        System.out.println("Bow Bow Bow");
    }
}
