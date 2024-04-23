// find the first element of array 
package BINARY_SEARCH;
public class second {
    public static int FindFirstPosition(int arr[],int length,int target){
        int ans=-1;
        int start=arr.length;
        int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (arr[mid]===target) {
                ans=mid;
                end=mid-1;
                
            }
            else if (arr[mid]<target) {
                start=mid+1;
                
            }
            else if (arr[mid]>target) {

                end=mid-1;
            }
            mid=(start+end)/2;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,5};
        int n=arr.length;
        int a=FindFirstPosition(arr,n,3);
        if (a>-1) {
            System.out.println("this  is first element in array index provid :"+a);

            
        }
        else{
            System.out.println("array is not repeated element :"+a);
        }
        
    }
    
}
