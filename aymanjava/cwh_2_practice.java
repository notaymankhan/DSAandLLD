package dsalld.aymanjava;

class Employee1{
    int salary;
    String name;
    int id;



    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
        System.out.println("and my salary is " + salary);
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Friend");
    }
}

class Square{
    int side;
    int area;
    int perimeter;

    public void setSide(int n){
        side = n;
    }

    public double area(){
        area = side*side;
        return area;
    }

    public int perimeter(){
        perimeter = 4*side;
        return perimeter;
    }
}


public class cwh_2_practice {
    public static void main(String[] args) {
//        System.out.println("Starting");
//        Employee1 ayman = new Employee1();
//        ayman.setName("Ayman Ahmed Khan");
//        ayman.salary = 120000;
//        ayman.id = 12;
//        ayman.printDetails();
//        System.out.println(ayman.getName());
//
////       problem 2
//        CellPhone iphone12 = new CellPhone();
//        iphone12.ring();
//        iphone12.vibrate();
//        iphone12.callFriend();

        Square s1 = new Square();
        s1.setSide(5);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());



    }
}
