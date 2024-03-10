package practice.secondDay;

import java.util.Scanner;

public class bina {
  public static int binarySearching(int arr[], int n, int target) {
    int low = 0;
    int height = n - 1;
    while (low <= height) {
      int mid = (low + height) / 2;
      if (arr[mid] == target) {
        // result=mid;
        return target;

      } else if (arr[mid] < target) {
        low = mid + 1;

      } else if (arr[mid] > target) {
        height = mid - 1;
      }

    }

    return 0;

  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int arr[] = { 2, 4, 6, 12, 14, 16 };
    int n = arr.length;
    System.out.println("enter the target element: ");
    int target = scan.nextInt();
    int a = binarySearching(arr, n, target);
    if (a == 0) {
      System.out.println("Array element not present"+a);

    } else if (a > 0) {
      System.out.println("Array element present:" + a);

    }
    scan.close();
  }
}
