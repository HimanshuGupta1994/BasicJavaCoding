package InterviewCodingQuestions;

public class displayDigitAndCharter {

    public static void main(String[] arg) {
        String str = "asd445";
        int count = 0, digi = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digi = digi * 10 + (ch - '0');
            } else {
                count = count + digi;
                digi = 0;
            }

        }
        if (digi > 0) {
            System.out.println("count: " + count);
            System.out.println("digi: " + digi);
            count += digi;
        }
//        System.out.println("final:" + count);
    }
}
