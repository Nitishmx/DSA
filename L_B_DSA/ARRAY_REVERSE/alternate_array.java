package ARRAY_REVERSE;

public class alternate_array {
    // Alternate array element algorithm
    public static void AlternateSwap(int array[],int size){
        for(int i=0;i<size;i=i+2){
            if (i+1<size) {
                int tem=array[i];
                array[i]=array[i+1];
                array[i+1]=tem;
                
            }
        }
        System.out.println("Done the alternate array printing");

    }

    // array element printing
    public static void PrintingArray(int array[],int n){
        for(int i=0;i<n;i++){
            System.out.print(array[i]);
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        int n=array.length;
        AlternateSwap(array,n);
        PrintingArray(array,n);
    }
    
}
