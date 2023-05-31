import java.util.Scanner;

public class EvenNoTilln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no till you have the even no " );
        int n = sc.nextInt();
        int i;
        int count =0;
        sc.close();
        for(i = 1; i<=n ; i++){
            if(i%2==0){
                System.out.println("even no are "+ i);
                count++;
            }
        }
        System.out.println("Count of even no is "+count);
    }
    
}
