import java.util.Scanner;

public class EvenorOddNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number"); 
        int i = sc.nextInt();
        sc.close();

        if(i%2==0){
            System.out.println(i + "  is a even number  ");
        }
        else{
            System.out.println(i +  "  is a odd number ");
        }
    }
}