package ARRAY_QUESTION;
// 4.	WAP to calculate the difference of sum of even elements and odd elements 
public class Ques4 {
    public static void differenceSum(int arr[],int n){
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if (arr[i]%2==0) {
                even+=arr[i];

                
            }
            else{
                odd+=arr[i];

            }
          
        }
        System.out.println("sum of even element:"+even);
        System.out.println("sum of odd element:"+odd);
     
    }
    public static void main(String[] args) {
        int arr[]={10,10,80,30,60,3,2};
        int n=arr.length;
        differenceSum(arr,n);

    }
    
}
