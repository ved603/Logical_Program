package Arrays;
import java.util.Arrays;
public class Product_except_self {
    public static void main(String[] args) {
        int [] arr = {2,5,6,8,10};
        int [] res = new int[arr.length];
        int prod = 1;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(arr[j] != arr[i]){
                    prod = prod * arr[j];
                }
            }
            res[i] = prod;
            prod = 1;
        }

        System.out.println(Arrays.toString(res));
    }
}
