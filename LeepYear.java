import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class LeepYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt();

        if((year%4== 0 && year%100 != 0) || (year%400 == 0)){
            System.out.println("this is leep year");
        }else{
            System.out.println("not leep year");
        }
    }
    
}
