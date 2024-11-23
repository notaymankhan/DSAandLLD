package dsalld.lld.patterns.FactoryDesign;

public class EmployeeFactory {
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("ANDROID DEV")){
            return new AndroidDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("WEB DEV")){
            return new WebDeveloper();
        }
        else{
            return null;
        }

    }
}
