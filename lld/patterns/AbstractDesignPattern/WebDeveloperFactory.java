package dsalld.lld.patterns.AbstractDesignPattern;

public class WebDeveloperFactory extends AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
