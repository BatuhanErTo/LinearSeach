import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,98,45},
                {53,86,28,91},
                {56,82,65,87,13},
                {109,432}
        };
        int[] ans = search(arr,13);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int column = 1; column < arr[row].length; column++){
                if(arr[row][column] == target){
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] arrs : arr){
            for(int ns : arrs){
                if(ns>max){
                    max = ns;
                }
            }
        }
        return max;
    }
}
