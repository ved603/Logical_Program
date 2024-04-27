package Arrays;
import java.util.*;
public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int k = sc.nextInt();
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int [] res = new int[arr.length-1];

        int j=0;
        System.out.println("Rotating the Array by exactly the : " +k+ " elements");
        if(k < arr.length) {
            for (int i = k ; i < arr.length-1; i++) {
                res[j] = arr[i];
                j++;
            }
            for(int i =0; i<k;i++){
                res[j] = arr[i];
                j++;
            }
        }
        System.out.println("The Array Elements are : ");
        for(int i=0; i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The Array Elements after rotation are ");
        for(int i=0; i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}



