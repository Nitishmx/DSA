package ARRAY;

public class reveseArray {
    static void ReveseArrayElement(int arr[],int lenght){
        for(int i=0;i<lenght/2;i++){
            int first=arr[i];
            arr[i]=arr[lenght-1-i];
            arr[lenght-1-i]=first;
            // arr[i]=first;
            // System.out.println(arr[i]);
        }

        for(int j=0;j<lenght-1;j++){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int n=arr.length;
        ReveseArrayElement(arr,n);
    }
}
