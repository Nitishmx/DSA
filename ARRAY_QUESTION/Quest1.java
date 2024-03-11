package ARRAY_QUESTION;
// 1.	WAP to create an array of size n

import java.util.Arrays;
import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the total no of element create in array:");
        int n=scan.nextInt();
        int array[]=new int[n];
        System.out.println("enter the array element store in array");
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(array));
        scan.close();
        
    }

    
}
