package ArrayQuestions;

public class twoDarray {

    public static void main(String[] arg) {
        int[][] a = {{1, 3}, {1, 4}, {4, 2}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
