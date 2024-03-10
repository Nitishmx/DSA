package practice;

public class reve {
    public static void ReverseArray(int arr[],int leng ){
        for(int i=0;i<leng/2;i++){
            int temp=arr[i];
            arr[i]=arr[leng-1-i];
            arr[leng-1-i]=temp;
        }
        for(int j=0;j<leng;j++){
            System.out.println(arr[j]);
        }

    }
    public static void main(String[] args) {
        int arr[]={10,20,40,60,70,80};
        int n=arr.length;
        ReverseArray(arr,n);
    }
    
}
