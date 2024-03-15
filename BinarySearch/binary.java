package BinarySearch;
import java.util.Scanner;
// Time complexity=O(logn)
// space complexity=O(1)
public class binary {
    public static int BinarySearch(int arr[],int target){
        int low=0;
        int heigh=arr.length-1;
        while (low<=heigh) {
            int mid=(low+heigh)/2;
            if (arr[mid]==target) {
                return target;
                
            }
            if (arr[mid]<target) {
                low=mid+1;
                
            }
            else if(arr[mid]>target){
                heigh=mid-1;
            }
            
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]={2,4,6,12,14,16};
        System.out.println("enter the target element");
        int target=scan.nextInt();
        int a=BinarySearch(arr,target);
        if (a==0) {
            System.out.println("array not present element:"+a);
            
        }
        else if (a!=0) {
            System.out.println("find the array element:"+a);

            
        }
        scan.close();
      
    }
    
}
