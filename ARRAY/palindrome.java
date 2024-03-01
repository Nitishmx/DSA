package ARRAY;

/**
 * palindrome
 */
public class palindrome {
    // write approach second
static void ArrayPalindrome(int arr[],int leng){
    // System.out.println(arr[0]);
    int flag=0;
        
        for(int i=0;i<leng/2;i++){
            if (arr[i]!=arr[leng-1-i]) {
                flag=1;
                System.out.println("not palindrome");
                break;
                
            }
    
        }
        if (flag==0) {
            
            System.out.println("array given value is a palindrome");
        }
    }
 
// write approach one
// static void ArrayPalindrome(int arr[],int len){
//     int newarray[]=new int[len];
//     int count=0;
//     for(int i=0;i<len-1;i++){
//         newarray[i]=arr[i];
       
//     }
//     for(int i=0;i<len-1;i++){
//         if (newarray[i]==arr[i]) {

//             count++;
//             System.out.println(newarray[i]+" "+arr[i]); 
//         }
//     }

// }

    public static void main(String[] args) {
        int arr[]={1,2,10,4,1};
        // System.out.println(arr[0]);
        int n=arr.length;
        // ArrayPalindrome(arr,n);
    }
}