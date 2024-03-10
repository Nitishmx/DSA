package practice;

public class d {
    public static void DuplicateElement(int ar[],int len){
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if (ar[i]==ar[j]) {
                    System.out.println("Duplicate element:"+ar[i]);
                    
                }
            }
        }
        

    }
    public static void main(String[] args) {
        int arra[]={1,2,3,4,5,10,10,11,1,2,4,6};
        int n=arra.length;
        DuplicateElement(arra,n);
    }
    
}
