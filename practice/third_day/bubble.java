package practice.third_day;

import java.util.Arrays;

public class bubble {
    public static void bubbleSort(int arr[],int len){
        int coun=1;
        for(int i=0;i<len;i++){
            coun++;
            int flag=0;
            for(int j=0;j<len-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag++;
                    
                }
            }
            if (flag>0) {
                break;
                
            }
        }
        System.out.println("run: "+coun);
    }
    public static void main(String[] args) {
        int arr[]={20,50,10,12,45,67,90,100};
        int n=arr.length;
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    
}
