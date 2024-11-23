package dsalld.aymanjava;

class Employee{
    int id;
    String name;
    int salary;


    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
        System.out.println("and my salary is " + salary);
    }

    public int getSalary(){
        return salary;
    }
}

public class cwh_1_class {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Employee ayman = new Employee(); // Instantiating a new Employee object
        // Setting Attributes
        ayman.id = 12;
        ayman.name = "Ayman";
        ayman.salary = 120000;

        System.out.println(ayman.getSalary());
        ayman.printDetails();
    }
}
