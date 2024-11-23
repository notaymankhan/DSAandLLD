package dsalld.lld.patterns.FactoryDesign;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("web developer salary");
        return 40000;
    }
}
