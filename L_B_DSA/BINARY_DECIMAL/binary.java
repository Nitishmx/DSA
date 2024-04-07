// package L_B_DSA.BINARY_DECIMAL;

import java.util.Scanner;
import java.lang.Math;
public class binary{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        double ans=0;
        int cout=0;
        int i=0;
        while (n!=0) {
            int bit=n&1;
            n=n>>1;
            // double pw=Math.pow(10,i);
            ans=(bit *Math.pow(10,i)+ans);
            i++;
            
            
        }
        System.out.println(ans);
    }
    
}
