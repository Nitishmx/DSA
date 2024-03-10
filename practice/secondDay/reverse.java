package practice.secondDay;

import java.util.Arrays;

public class reverse {
    public static void reverseArray(int arr[],int len){
        for(int i=0;i<len/2;i++){
            int tem=arr[i];
            arr[i]=arr[len-1-i];
            arr[len-1-i]=tem;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int n=arr.length;
        reverseArray(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    
}
