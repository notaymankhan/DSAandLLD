package dsalld.lld.patterns.AbstractDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int Salary() {
        System.out.println("web developer salary");
        return 40000;
    }

    @Override
    public String Name() {
        return "I am a Web Developer";
    }
}
