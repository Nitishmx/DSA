package BinarySearch;

import java.util.Scanner;

public class lowerbound_first_occurrence {
    public static int findFirstOccurence(int arra[],int target){
        int result=-1;
        int low=0;
        int hight=arra.length-1;
        while (low<=hight) {
            int mid=(low+hight)/2;
            if (arra[mid]==target) {
                result=mid;
                // traverse to left side of array
                hight=mid-1;
                
            }
            else if(arra[mid]>target){
                hight=mid-1;
            }
            else{
                low=mid+1;
            }
            
            
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of array element");
        int n=scan.nextInt();
        int arra[]=new int[n];
        System.out.println("enter the array element");
        for(int i=0;i<n;i++){
            arra[i]=scan.nextInt();
        }
        System.out.println("enter the target element");
        int target=scan.nextInt();
        // function call 
        int result=findFirstOccurence( arra,target);
        if (result==-1) {
            System.out.println("element not present in arrat");
            
        }
        else{
            System.out.println("find the element in array:"+result);
        }
    }
}
