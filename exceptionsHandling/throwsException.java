package exceptionsHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throwsException {

    public static void main(String arg[]) {
        int age = 16 ;


            if (age < 18)
                throw new youngerExceptions();
            else
                System.out.println("Vote it");

    }
}

class youngerExceptions extends RuntimeException {
    youngerExceptions(){
        super("Under Age");
    }
    youngerExceptions(String msg){
        super(msg);
    }
}
