public class PrintEvenNoto10 {
    public static void main(String[] args){
        int count =0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println("even Number are "+i);
                count++;
            }
        }
        System.out.println("count of numbers "+count);
    }
    
}
