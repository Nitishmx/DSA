package ARRAY_REVERSE;
public class reverse {
    public static void Reversearray(int arr[],int size){
        int start=0;
        int end=size-1;
        while (start<=end) {
            int a=arr[start];
            arr[start]=arr[end];
            arr[end]=a;
            
        }
    }
    public static void PrintinArray(int arr[],int length){
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr2[]={1,2,3,4,5};
        int a=arr.length;
        int b=arr2.length;
        Reversearray(arr,a);
        Reversearray(arr2, b);
        PrintinArray(arr,a);
        PrintinArray(arr2, b);
    }
    
}
