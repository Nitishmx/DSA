package practice;

import java.util.Arrays;

public class rotae {
    public static void rotae(int arra[][]) {
        int row = arra.length;
        int col = arra[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = arra[i][j];
                arra[i][j] = arra[j][i];
                arra[j][i] = temp;
            }
        }
        for (int i = 0; i < row; i++) {
            int left = 0;
            int right = arra.length - 1;

            while (left < right) {
                int temp = arra[i][left];
                arra[i][left] = arra[i][right];
                arra[i][right] = temp;
                left++;
                right--;

            }

        }
    }

    public static void main(String[] args) {
        int arra[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12, }, { 13, 14, 15, 16 } };
        rotae(arra);
        for (var g : arra) {
            System.out.println(Arrays.toString(g));
        }
    }

}
