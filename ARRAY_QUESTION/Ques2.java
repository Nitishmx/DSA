package ARRAY_QUESTION;
// 2.	WAP to calculate sum of all the array elements
public class Ques2 {
    public static int CalculateSum(int arr[],int n){
        // sum all array element
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={10,45,10,80,30,60,3,2};
        int n=arr.length;
        int sum=CalculateSum(arr,n);
        System.out.println("Sum of array element:"+sum);
    }
    
}
