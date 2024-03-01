package practice;
// time complexity =O(n)
// space complexity=O(1)
public class palin {
    static void Check(int arra[]){
        int n=arra.length;
        int flag=0;
        for(int i=0;i<n/2;i++){
            if (arra[i]!=arra[n-i-1]) {
                flag++;
                System.out.println("not palidrom");
                break;
                
            }
        }
        if (flag==0) {
            System.out.println("palindrom");
            
        }

    }

    
    public static void main(String[] args) {
        int arra[]={10,20,30,100,30,20,10};
        Check(arra);
    }
}
    

