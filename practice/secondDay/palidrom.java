package practice.secondDay;

public class palidrom {
    public static void palidromChecking(int arr[],int len){
        int sign=-1;
        for(int i=0;i<len/2;i++){
            if (arr[i]!=arr[len-1-i]) {
                System.out.println("this array is not palidrom");
                break;
                
            }
            sign++;
        }
        if (sign> -1) {
            System.out.println("this array is palidrom");
            
        }
    }
    public static void main(String[] args) {
        int arra[]={10,20,40,20,10};
        int n=arra.length;
        palidromChecking(arra,n);
    }
    
}
