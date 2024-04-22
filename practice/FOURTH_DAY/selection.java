import java.util.Arrays;
// Time complexity=O(n2)
// Space complexity=O(1)
public class selection {
    public static void arraySORT(int array[]){
        for(int i=1;i<array.length;i++){
            int j=i;
            while (j>0&&array[j]<array[j-1]) {
                int temp=array[j];
                array[j-1]=array[j];
                array[j]=temp;
                j--;
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={20,50,10,45,67,90,100};
        arraySORT(arr);
        System.out.println(Arrays.toString(arr));

    }
}
