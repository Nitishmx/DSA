package ARRAY_QUESTION;

import java.util.Arrays;

// 10.	WAP to find the second largest element in an array
public class Ques10 {
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
        int array[]={10,50,40,520,60,90,10};
        int lenght=array.length;
        sortingArray(array,lenght);
        System.out.println(Arrays.toString(array));
        System.out.println("Find second largest element in array :"+array[lenght-2]);

    }
    
}
