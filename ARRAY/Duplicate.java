package ARRAY;

public class Duplicate {
    static void DuplicatElement(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]) {
                    System.out.println("Duplicate array element:"+arr[i]);
                    
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,20,40,10,200,10,40};
        DuplicatElement(arr);

    }
    
}
