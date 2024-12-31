package loopCoding;

/*
1
2	3
4	5	6
7	8	9	10
 */
public class triangleNumberPyramid {

    public static void main(String[] arg) {
        int i, j, num = 1;
        for (i = 1; i <= 4; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println("\n");
        }
    }
}