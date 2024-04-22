package BINARY_SEARCH;

public class first {
    public static int binarySerach(int arr[],int size,int target){
        int start=0;
        int end=size-1;
        int mid =(start+end)/2;
        while (start<=end) {
            if (arr[mid]==target) {
                return mid;
                
            }
            if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,12,18};
        int n=arr.length;
       int a= binarySerach(arr,n,24);
       if (a>=0) {
        System.out.println("element is present");
        
       }
       else{
        System.out.println("element is not present");
       }
    }
    
}
