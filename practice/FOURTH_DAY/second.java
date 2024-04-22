import java.util.Arrays;
// Time complexity=O(n2)
// Space complexity=O(1)
public class second {
    public static void bubbleSorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean a=false;
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int teamp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=teamp;
                    a=true;
                    
                }
               
                
            }
            if (a==false) {
                break;
                
            }
           
        }
    }

    public static void main(String[] args) {
        int arr[]={20,50,10,45,67,90,100};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}