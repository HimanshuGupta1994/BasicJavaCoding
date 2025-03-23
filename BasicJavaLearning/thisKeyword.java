package BasicJavaLearning;

public class thisKeyword {
    String name = "Himanshu";
    public void getName(){
        String name = "Golu";
        System.out.println("Local Name: " + name);
        System.out.println("Global Name: " + this.name);
    }
    public static void main(String[] arg){
        thisKeyword obj = new thisKeyword();
        obj.getName();
    }
}
