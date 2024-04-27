package Arrays;
import java.util.*;
public class Two_Sum {
    public static void main(String[] args) {
        int [] res = new int[2];
        Scanner sc = new Scanner(System.in);
        int [] a = {4,5,6,7,1,3,2};
        System.out.print("Enter the Targeted Sum : ");
        int b = sc.nextInt();
        for(int i=0; i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] + a[j]) == b) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        System.out.println("The Array Element is : " +Arrays.toString(a));
        if(res[0] == res[1]){
            System.out.println("The Sum is Not Possible");
        }
        else {
            System.out.println("The Required Array element whose sum is equal to target is at possition : " +Arrays.toString(res));
        }
    }
}
