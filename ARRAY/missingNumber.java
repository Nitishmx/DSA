package ARRAY;

public class missingNumber {
    static void missArrayElememt(int arr[]){
        int n=arr.length;
        int sumNuralN=((n+1)*(n+2)/2);
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            // System.out.println(arr[i]);
            
        }
        int miss=sumNuralN-sum;
        System.out.println("missing element in an array:"+miss);
        // for(int i=0;i<leng;)
    }
    public static void main(String[] args) {
        int arra[]={1,2,3,4,5,6,7,9,10};
    //    int n=arra.length;
        missArrayElememt(arra);
    }
    
}
