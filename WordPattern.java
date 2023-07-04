import java.util.regex.*;

public class WordPattern {
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,5}");
        Matcher m = p.matcher("Dipali");
        boolean conditionCheck = m.matches();
        System.out.println("first name = "+conditionCheck);


    
    }
}
