package ARRAY_QUESTION;
import java.util.Arrays;
// 12.	WAP to sort an array in ascending order
// Time complexity =O(n2)
// Space complexity=O(1)
public class Ques12 {
    public static void sortingArray(int array[],int lenght){
        for(int i=0;i<lenght;i++){
            for(int j=0;j<lenght-1-i;j++){
                if (array[j]>array[j+1]) {
                    int tem=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tem;

                    
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int array[]={10,50,40,520,60,90,18};
        int lenght=array.length;
        sortingArray(array,lenght);
        System.out.println("Sort array element in assending order : "+Arrays.toString(array));
    }

    
}
