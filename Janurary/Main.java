package Janurary;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 3, start =0, last = arr.length-1;
//        for(int i=0; i<num; i++) {
            reverseArray(arr, start, last);
//            start += num;
//            last += num;
//        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    private static void reverseArray(int[] arr, int start, int last) {
        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }
}
