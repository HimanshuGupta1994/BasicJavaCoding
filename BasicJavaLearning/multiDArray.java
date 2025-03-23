package BasicJavaLearning;

public class multiDArray {
    public static void main(String[] arg){
       int[][] arr ={{1,3,4},{2,5,6},{3,5,6}};
       int min = arr[0][0];
       for (int j=0; j<3;j++) {
           for (int k=0;k<3;k++){
               System.out.println(arr[j][k]);
               if(min>arr[j][k])
                   min = arr[j][k];
           }
       }
       System.out.println("min"+min);
    }
}
