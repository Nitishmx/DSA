package Linear_searching;
// time complexity =O(n)
// space complexity=O(1)
import java.util.Scanner;

public class linersearch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the total element of array");
        int n=scan.nextInt();
        System.out.println("enter the array element");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("enter the target element");
        int x=scan.nextInt();
        // implementation of linear search
        int in=-1;
        for(int i=0;i<n;i++){
            if (arr[i]==x) {
                in=i;
                // System.out.println("find the element:"+arr[i]);
                break;
                
            }
        }
       if (in==-1) {
        System.out.println("Array element not present in array");
        
       }
       else{
        System.out.println("array element present:"+in);

       }
    }
    
}
