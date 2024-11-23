package dsalld.aymanjava;

class MyEmployee{
    private int id;
    private String name;

    public void setId(int n){
        id = n;
    }

    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
}


public class cwh_3_chapter40 {
    public static void main(String[] args) {
        MyEmployee ayman = new MyEmployee();
        ayman.setId(12);
        ayman.setName("Ayman");
        ayman.printDetails();

    }
}
