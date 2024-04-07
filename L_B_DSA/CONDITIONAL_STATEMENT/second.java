package CONDITIONAL_STATEMENT;
// if alphabet capital letter then upper case if else alphabet small letter then small else number
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the character");
        char c = scan.next().charAt(0);
        if (c>=65||c<=90) {
            System.out.println("This character is capital letter");

            
        }
        else if (c>=97||c<=122) {
            System.out.println("This character is small letter");
            
        }

        // else{
        //     System.out.println("This is numerical value");
        // }
       


        scan.close();

    }
    
}
