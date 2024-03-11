package ARRAY_QUESTION;

import java.util.Scanner;

// 5.	WAP to display all numbers between two given range
public class Ques5 {
    public static void displayElment(int arr[],int n,int first,int second){
        for(int i=first;i<=second;i++){
            System.out.println(i);
          
          
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]={10,10,80,30,60,3,2};
        int n=arr.length;
        System.out.println("enter first element:");
        int fist=scan.nextInt();
        System.out.println("enter second element:");
        int seco=scan.nextInt();
        displayElment(arr,n,fist,seco);
        
    }
    
}
