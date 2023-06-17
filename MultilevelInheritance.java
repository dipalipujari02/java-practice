public class MultilevelInheritance {
static class Shape{
    void area(){
        System.out.println("display area");
    }
}    
static class Circle extends Shape{
    void area (int r){
        System.out.println("area of circle ="+ 3.14*r*r );
    }
}    
static class Triangle extends Circle{
    void area(int b , int h){
        System.out.println("area of triangle = "+ 0.5*b*h);
    }
}

public static void main(String[] args) {
    Shape s = new Shape();
    s.area();

    Circle c =new Circle();
    c.area(4);

    Triangle t = new Triangle();
    t.area(4, 8);
}
}
