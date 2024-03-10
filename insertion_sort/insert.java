package insertion_sort;

import java.util.Arrays;

public class insert {
    public static void  sortInsertion(int arr[],int len){
        for(int i=1;i<len-1;i++){
            int j=i;
            while (j>0&&arr[j]<arr[j-1]) {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={12, 11, 13, 5, 6,44,010,11,78,57,20,8,2,6};
        int n=arr.length;
        sortInsertion(arr,n);
        System.out.println(Arrays.toString(arr));

    }
    
}
 