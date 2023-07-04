import java.util.regex.Matcher;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("pattern is ");
        

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static Pattern compile(String string) {
        return null;
    }

    public Matcher matcher(String string) {
        return null;
    }
}
   