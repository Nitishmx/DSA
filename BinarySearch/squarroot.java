package BinarySearch;
import java.util.Scanner;
public class squarroot {
    public static int findSquarRoot(int num) {
        int low = 0;
        int heigh = num;
        int result = -1;
        while (low <= heigh) {
            int mid = (low + heigh) / 2;
            long valu = mid * mid;
            if (valu == num) {
                return mid;

            } else if (valu < num) { 
                // store the floor value
                result = mid;
                low = mid + 1;

            } else {
                heigh = mid - 1;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no of which you want the square root calculte");
        int n = scan.nextInt();
        int result = findSquarRoot(n);
        System.out.println("Square root of the given number is :" + result);
    }

}
