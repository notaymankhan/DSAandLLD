package dsalld.lld.patterns.AbstractDesignPattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int Salary() {
        System.out.println("android developer salary");
        return 50000;
    }

    @Override
    public String Name() {
        return "I am Android Developer";
    }

}
