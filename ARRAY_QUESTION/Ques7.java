package ARRAY_QUESTION;

import java.util.Arrays;
import java.util.Scanner;

class Ques7 {
    // 7.	WAP to find largest element from an array
    public static void largestElement(int arr[],int length){
        for(int i=0;i<1;i++){
            for(int j=0;j<length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                   int  temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;

                    
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the total element in array:");
        int n=scan.nextInt();
        int arra[]=new int[n];
        for(int i=0;i<n;i++){
            arra[i]=scan.nextInt();

        }
        largestElement(arra,n);
        System.out.println("Largest element in array:"+arra[arra.length-1]);
        
    }
}
