public class PrimeNo{
    public static void main(String[] args) {
        int i;
        int j;
        int prime =0;
        for(i = 1; i<51; i++){
            int count = 0;
            for(j = 1; j<=i; j++){
                if(i%j==0){
                    count = count + 1;
                }
            }
            if(count==2){
                System.out.println(i);
                prime++;
            }
        }
        System.out.println("prime Number are"+prime);
    }
    
}
