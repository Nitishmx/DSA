package ARRAY_QUESTION;
// 11.	WAP to find the second smallest element in an array
import java.util.Arrays;

public class Ques11 {
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
        System.out.println(Arrays.toString(array));
        System.out.println("Find the second smallest element in array :"+array[1]);

    }
    
}
