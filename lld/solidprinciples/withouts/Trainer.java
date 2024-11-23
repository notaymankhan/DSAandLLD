package dsalld.lld.solidprinciples.withouts;

public class Trainer {
    private String name;
    private int id;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Trainer(String name,int id,int age){
        this.name = name;
        this.id = id;
        this.age = age;

        System.out.println("Trainer Created name: "+name+" id: "+id+" age: "+age);
    }

    public void createDietPlan(){
        System.out.println("Diet Plan Created");
    }

    public void createRegiment(){
        System.out.println("Regiment Created");
    }

    public void calculateReward(){
        System.out.println("Reward Calculated");
    }

}
