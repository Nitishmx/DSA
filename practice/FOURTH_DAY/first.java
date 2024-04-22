package practice.FOURTH_DAY;
// Time complexity =0(n)
// Space complexity=O(1)
import practice.secondDay.palidrom;

// check the array palindrome or not
public class first {
    public static void cheakPalindrome(int array[],int leng){
        int flag=0;
        for(int i=0;i<leng/2;i++){
            if (array[i]!=array[leng-1-i]) {
                flag++;
                break;
            }

        }
        if (flag!=0) {
            
            System.out.println("This array is not palindrome");
        }
        else{
            System.out.println("This array is a palidrom");
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        int n=arr.length;
        cheakPalindrome(arr,n);

        
    }
    
}
