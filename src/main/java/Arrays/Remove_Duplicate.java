package Arrays;
import java.util.*;
public class Remove_Duplicate {
    public static int Duplicate(int [] arr){

        int j=0;
        for(int i=1;i < arr.length;i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }

        }
        return j+1;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4,5,5,6,7};
        int a = Duplicate(arr);
        for(int i=0; i<a;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
