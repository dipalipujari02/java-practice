import java.util.Scanner; 

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value you have to compair ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
       
        if(a<b){
            System.out.println("b is greter");
        }else{
            System.out.println("a is greter");
        }
    }
    
}
