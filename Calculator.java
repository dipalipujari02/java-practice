import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        double n1 = sc.nextDouble();
        System.out.println("Enter the second number ");
        double n2 = sc.nextDouble();
        System.out.println("Enter the operator(+,-,*,/,%) ");
        char operator = sc.next().charAt(0);
        double c;
        sc.close();

        switch(operator){
            case '+': c = n1+n2;
                      System.out.println("Addition is "+c);
                     break;
                
            case '-':c = n1-n2;
                     System.out.println("Subtraction is "+c);
                     break;         
            
            case '*':c = n1*n2;
                     System.out.println("Muitiplycation is "+c);
                     break;
            
            case '/':c = n1/n2;
                     System.out.println("Division is "+c);
                     break; 
            
            case '%':c = n1%n2;
                      System.out.println("Remander is "+c);
                     break;
                     
            default:System.out.println("Enter valid operator ");         
        }

     }
    
}
