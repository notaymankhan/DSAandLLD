package dsalld.lld.solidprinciples.withs;

public class Trainer {
    private String name;
    private int id;
    private int age;

    public Trainer(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        System.out.println("Trainer Created name: " + name + " id: " + id + " age: " + age);
    }


}
