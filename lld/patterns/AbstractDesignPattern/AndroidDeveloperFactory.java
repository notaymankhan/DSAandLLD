package dsalld.lld.patterns.AbstractDesignPattern;

public class AndroidDeveloperFactory extends AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
