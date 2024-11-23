package dsalld.lld.patterns.AbstractDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(AbstractEmployeeFactory factory){
        return factory.createEmployee();
    }
}
