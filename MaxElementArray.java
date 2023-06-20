import java.util.Arrays;

public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr ={12,24,123,87,65,43,23,54,89,99};
        System.out.println(Arrays.toString(arr));
        int max = arr[0];

        for(int i=0;i<=arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                
            }
        
        }
        System.out.println(max);
    }
    
}
