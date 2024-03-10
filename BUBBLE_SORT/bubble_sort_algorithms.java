// Time complexity=O(n2)
// Spcae complexity=O(1)
package BUBBLE_SORT;
import java.util.Arrays;
public class bubble_sort_algorithms {
    // private static boolean swap;
    public static void bubbleSort(int arr[],int lengt){
        for(int i=0;i<lengt-1;i++){
            boolean swap=false;
            for(int j=0;j<lengt-1-i;j++){
                // for every iteration we get the bigest element in an array in th end
                if (arr[j]>arr[j+1]) {
                    // swap between arr[j] and arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
                
            }
            if (swap==false) {
                break;
                
            }
        }
        // return 0;
    }
    public static void main(String[] args) {
        int arr[]={20,50,10,12,45,67,90,100};
        // bubble sort function call
        int len=arr.length;
        bubbleSort(arr,len);
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
    
}
