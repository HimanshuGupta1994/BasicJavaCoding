package BasicJavaLearning;

public class childClass extends parentClass{
    String name = "Himanshu Gupta";
    childClass(){
        super();
        System.out.println("This is Child Class constructor");
    }
    void getName(){
        System.out.println("This Is child class name:" + name);
        System.out.println("This is parent class name" + super.name);
        super.getName();
    }
    public static void main(String[] arg){
        childClass obj = new childClass();
        obj.getName();
    }
}
