package ARRAY;

import java.util.Scanner;

public class Prifix_sum {
    static int  PrefixSum(int arr[][],int row1,int c1,int row2,int c2){
        int sum=0;
        for(int i=row1;row1<=row2;i++){
            for(int j=c1;c1<=c2;j++){
                sum+=arr[i][j];

            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int m=scan.nextInt();
        System.out.println("enter the number of columns:");
        int n=scan.nextInt();
        int arra[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // System.out.println("j    fj");
                arra[i][j]=scan.nextInt();
            }
        }
        int r1,c1,r2,c2;
        System.out.println("Enter the array elements");
        System.out.println("enter row first");
        r1=scan.nextInt();
        System.out.println("enter the column first");
        c1=scan.nextInt();
        System.out.println("please enter the second row and colums first greater");
        System.out.println("enter the second row");
        r2=scan.nextInt();
        System.out.println("enter the column second");
        c2=scan.nextInt();  

        // System.out.println(arra[0].length);
       int a= PrefixSum(arra,r1,c1,r2,c2);
       System.out.println("Prefix sum: "+a);
    
    }
    
}
