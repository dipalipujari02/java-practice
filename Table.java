import java.util.Scanner;

public class Table{
    public static void main(String[] args) {
        System.out.println("Enter the no whose you have a table ");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        sc.close();
        for(int i =1; i<=10 ; i++){
           System.out.println(i+"X"+j+"="+i*j);
        }
    }

}
