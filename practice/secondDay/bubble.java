package practice.secondDay;

import java.util.Arrays;

public class bubble {
    public static void bubbleSort(int arr[],int len){
        for(int i=1;i<len;i++){
            int flag=0;
            for(int j=0;j<len-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag++;
                    
                }
            }
            if (flag==0) {
                break;
                
            }
        }


    }
    public static void main(String[] args) {
        int ar[]={20,50,10,40,100,90};
        int n=ar.length;
        bubbleSort(ar,n);
        System.out.println(Arrays.toString(ar));
    }
    
}
