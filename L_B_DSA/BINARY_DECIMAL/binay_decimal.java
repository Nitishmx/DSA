import java.util.Scanner;
import java.lang.Math;
public class binay_decimal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the binary no");
        int n=scan.nextInt();
        int i=0;
        double ans=0;
        while (n!=0) {
            int bit=n%10;
            if (bit==1) {
                ans=ans+Math.pow (2, i);

                
            }
            n=n/10;
            i++;
            
        }
        System.out.println(ans);
        scan.close();
    }
}
