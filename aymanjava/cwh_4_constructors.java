package dsalld.aymanjava;

class MyMainEmployee{
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

//    constructor
    public MyMainEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String name, int id){
        this.id = id;
        this.name = name;
    }



}
public class cwh_4_constructors {
    public static void main(String[] args) {
        MyMainEmployee ayman = new MyMainEmployee("ayman ahmed khan",12);
        MyMainEmployee harry = new MyMainEmployee();
//        constructor has been overloaded
        ayman.printDetails();
        harry.printDetails();


    }
}
