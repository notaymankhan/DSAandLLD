package dsalld.aymanjava;

class Circle{
    int radius;
    Circle(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

    public double perimeter(){
        return 2*Math.PI*this.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void printdetails(){
        System.out.println("I am a circle with radius "+this.radius);
        System.out.println("and my area is "+this.area());
    }
}

class Cylinder extends Circle{
    int height;
    Cylinder(int r,int h){
        super(r);
        this.height = h;
    }

    public double CSA(){
        return perimeter()*this.height;
    }

    public double TSA(){
        return CSA() + 2*area();
    }

    public void printdetails(){
        System.out.println("I am a cylinder with radius "+this.radius+" and height "+this.height);
        System.out.println("My Perimeter is "+this.perimeter());
        System.out.println("My CSA is "+this.CSA());
        System.out.println("My TSA is "+this.TSA());
    }


}

public class cwh_10_inheritancequestions {
    public static void main(String[] args) {
//        prioblem 1 create a class circle and use inheritance to create another class cylinder fron it

//        Circle c = new Circle(3);
//        c.printdetails();

        Circle Cy = new Cylinder(10,10);
        Cy.printdetails();

    }
}
