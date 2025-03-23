package ArrayQuestions;

public class MinAndMaxInArray {
//    public static void main(String[] arg) {
//        int[] arr = {1, 4, 1, 6, 87, 0};
//        int min = arr[0], max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (min > arr[i]) {
//               min = arr[i];
//            }
//            if(max < arr[i])
//                max = arr[i];
//        }
//        System.out.println("Min Number is :" + min);
//        System.out.println("Max Number is :" + max);
//    }

    //write down java prog to array in dec order [4] 7 5 9 3

    public static void main(String[] arg) {

        int[] arr = {7, 5, 9, 3};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (max < arr[j]) {
                    temp = arr[j];
                    arr[j] = max;
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println("Output is: " + arr[i]);
    }
}

