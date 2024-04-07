package CONDITIONAL_STATEMENT;

import java.util.Scanner;

// sum of all even number
public class sun_even {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            if (i%2==0) {
                sum=sum+i;
                
            }
        }
        System.out.println("Sum of all even number :"+sum);
    }
}
