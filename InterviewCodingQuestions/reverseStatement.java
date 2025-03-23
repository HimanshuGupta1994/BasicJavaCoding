package InterviewCodingQuestions;

public class reverseStatement {

    public static void main(String[] arg){
        String word =  "Java is good programming languages";
        String revs = "";
        String[] str = word.split(" ");
        for(String string : str) {
            revs += reverse(string) + " ";
        }
        System.out.println(revs.trim());
    }
    public static String reverse(String str) {
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--)
            reverse += String.valueOf(str.charAt(i));
        System.out.println(reverse);
        return reverse;
    }
}
