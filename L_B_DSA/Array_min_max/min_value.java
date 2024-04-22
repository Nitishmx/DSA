package Array_min_max;

public class min_value {
    public static void findMinValu(int arr[],int size){
        int max=Integer.MAX_VALUE;
       for(int i=0;i<size;i++){
        if (arr[i]<max) {
            max=arr[i];
            
        }
    }
    System.out.println("minimum value of array : "+max);
    }

    public static void findMaxValue(int arr[],int size){
        int min=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if (arr[i]>min) {
                min=arr[i];
                
            }
        }
        System.out.println("Maximum value : "+min);
    }
    public static void main(String[] args) {
        int arra[]={10,80,10,60,2,8};
        int a=arra.length;
        findMinValu(arra,a);
        findMaxValue(arra,a);
    }
    
}
