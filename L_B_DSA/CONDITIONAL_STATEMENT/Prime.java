package CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if (n%i==0) {
                count++;
                break;
                
            }
        }
        if (count==0) {
            System.out.println("Number is prime");
            
        }
        else{
            System.out.println("Number is not prime");
        }
    }
    
}
