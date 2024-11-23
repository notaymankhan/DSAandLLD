package dsalld.lld.patterns.AbstractDesignPattern;

public class Main {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println(e1.Salary());
        System.out.println(e1.Name());


        Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println(e2.Salary());
        System.out.println(e2.Name());
    }
 }
