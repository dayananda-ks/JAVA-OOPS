package Day9;
import java.util.Arrays;
public class JaggedArray {
    public static void main(String[] args)
    {
        int array[][] = {{10,30},{5,8,7},{1,2,3,4}};
        int len =  array.length;
        for (int i =0; i<len; i++) {
            for(int j = i;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
