package CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the any number");
        int n=scan.nextInt();
        if (n>0) {
           System.out.println("this is positive number");
            
        }
        else if (n==0) {
            System.out.println("this is zero number");
            
        }
        else{
            System.out.println("this number is negative");
        }
    }
    
}
