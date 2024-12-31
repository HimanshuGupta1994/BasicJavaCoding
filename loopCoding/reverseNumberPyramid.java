package loopCoding;
/*
1 2 3 4
5 6 7
8 9
10
*/
public class reverseNumberPyramid {
    public static void main(String[] arg) {
        int num = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("\n");
        }
    }
}
