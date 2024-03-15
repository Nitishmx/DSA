package ARRAY_QUESTION;

import java.util.Arrays;
// Timepmplexity=O(n)
// Spacecomplexity=O(1)

// 6.	WAP to reverse an array
public class Ques6 {
    public static void arrayReverse(int arr[],int length){
        for(int i=0;i<length/2;i++){
            int tem=arr[i];
            arr[i]=arr[length-1-i];
            arr[length-1-i]=tem;

        }
    }
    public static void main(String[] args) {
        int arr[]={10,10,80,30,60,3,2};
        int length=arr.length;
        arrayReverse(arr,length);
        System.out.println(Arrays.toString(arr));
    
}
}