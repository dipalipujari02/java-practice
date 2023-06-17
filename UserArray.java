import java.util.Scanner;

public class UserArray {
  
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Eneter Rows of matrix");
        int row = sc.nextInt();
        System.out.println("Enter coloumn of matrix");
        int coloumn =sc.nextInt();
        int[][] arr = new int [row][coloumn];
        System.out.println("Enter element in matxix");

        for(int i =0;i<row;i++){
            for(int j=0;j<coloumn;j++){
               arr[i][j]= sc.nextInt();

            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                System.out.println(arr[i][j]);
            }
        }

    }

}