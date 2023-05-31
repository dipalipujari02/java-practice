import java.util.Scanner;

public class RadiusAreaofCircle {
    public static void main(String[] args) {
        System.out.println("Enter radius " );
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        sc.close();
        double area = 3.14*r*r;
        System.out.println("Area of circle whose radius is "+r +" = "+area ); 
    }
    
}
