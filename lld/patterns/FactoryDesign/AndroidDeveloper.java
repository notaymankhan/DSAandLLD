package dsalld.lld.patterns.FactoryDesign;

public class AndroidDeveloper implements Employee {
    @Override
    public int getSalary() {
        System.out.println("android developer salary");
        return 50000;
    }
}
