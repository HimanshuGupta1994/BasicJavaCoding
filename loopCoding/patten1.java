package loopCoding;

/*
1
1 2
1 2 3
1 2 3 4
*/
/*
3
6 9
12 15 18
 */
public class patten1 {
    public static void main(String[] arg) {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + "\t");
            }
            System.out.println("\n");
        }
        int num = 1;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num * 3 + "\t");
                num++;
            }
            System.out.println("\n");
        }
    }
}
