package TWO_D_ARRAY;

import java.util.Arrays;

public class rotate_two {
    static void RatateMatrix(int arrays[][]){
        int row=arrays.length;
        int colu=arrays[0].length;
        for(int i=0;i<row;i++){
            for(int j=i;j<colu;j++){
                int temp=arrays[i][j];
                arrays[i][j]=arrays[j][i];
                arrays[j][i]=temp;
            }
        }
        for(int i=0;i<row;i++){
            int l=0;
            int r=row-1;
            while (l<r) {
                int temp=arrays[i][l];
                arrays[i][l]=arrays[i][r];
                arrays[i][r]=temp;
                l++;
                r--;
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        RatateMatrix(arr);
        for(var g:arr){
            System.out.println(Arrays.toString(g));
        }
    }
    
}
