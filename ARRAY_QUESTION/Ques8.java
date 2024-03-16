package ARRAY_QUESTION;
import java.util.Arrays;

// 8.	WAP to find smallest element from an array
public class Ques8 {
    public static void smalestElement(int array[],int length){
        for(int i=1;i<length;i++){
           int j=i;
           while (j>0&&array[j]<array[j-1]) {
            int temp=array[j];
            array[j]=array[j-1];
            array[j-1]=temp;
            j--;
            
           }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,10,80,30,60,3,2};
        int n=arr.length;
        smalestElement(arr,n);
        System.out.println(Arrays.toString(arr));
        System.out.println("smallest element in array:"+arr[0]);
    }
    
}
