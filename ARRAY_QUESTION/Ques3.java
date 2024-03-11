package ARRAY_QUESTION;
// 3.	WAP to product of all the array elements
public class Ques3 {
    public static int productArray(int arr[],int n){
        int prod=0;
        for(int i=0;i<n;i++){
            prod+=arr[i];

        }
        return prod;

    }
    public static void main(String[] args) {
        int arr[]={10,10,80,30,60,3,2};
        int n=arr.length;
        int prod=productArray(arr,n);
        System.out.println("product of all array element:"+prod);

    }
    
}
