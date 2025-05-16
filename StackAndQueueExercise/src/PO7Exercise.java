import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PO7Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {13, 7, 6, 12};
        ArrayDeque<Integer> stack = new ArrayDeque<>();


        int start=0;
        int faster=1;

        while(start!=arr.length-1){
            if (arr[start]<arr[faster]){
                arr[start]=arr[faster];
                start++;
                faster=start+1;
            }else{
                faster++;
                if (faster>arr.length-1){
                    arr[start]=-1;
                    start++;
                    faster=start+1;
                }
            }
        }
        arr[arr.length-1]=-1;
        System.out.println(Arrays.toString(arr));
    }
}
