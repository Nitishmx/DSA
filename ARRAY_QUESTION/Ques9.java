package ARRAY_QUESTION;

import java.util.Arrays;

// 9.	WAP to find the difference of maximum and minimum element of an array
public class Ques9 {
    static void arrayShort(int arr[],int length){
        for(int i=0;i<length;i++){
            for(int j=0;j<length-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;


                    
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[]={10,50,40,520,60,90,10};
        int length=array.length;
        arrayShort(array,length);
        System.out.println(Arrays.toString(array));
        int minValue=array[0];
        int maxValue=array[array.length-1];
        int different=maxValue-minValue;
        System.out.println("different of maximum and minimum : "+different);
        
    }
    
}
