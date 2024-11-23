package dsalld.lld.patterns.FactoryDesign;

public class Main {
    public static void main(String[] args) {
//        Employee emp1 = new AndroidDeveloper();
//        Employee emp2 = new WebDeveloper();
//        System.out.println(emp1.getSalary());
//        System.out.println(emp2.getSalary());

        Employee emp1 = EmployeeFactory.getEmployee("ANDROID DEV");
        System.out.println(emp1.getSalary());
        Employee emp2 = EmployeeFactory.getEmployee("WEB DEV");
        System.out.println(emp2.getSalary());
    }
}
