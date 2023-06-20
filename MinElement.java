import javax.sound.sampled.SourceDataLine;

public class MinElement {
    public static void main(String[] args) {
        int[] arr={89,98,1,34,76,54,1,2,3,4};
        int min =arr[0];

        for (int element : arr) {
            if(element<min){
                min=element;
            }
        }
        System.out.println(min);
    }
    
    
}
