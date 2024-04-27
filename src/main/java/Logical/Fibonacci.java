package Logical;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");
        int in = sc.nextInt();
        int prev = 0;
        int curr = 1;

        System.out.println(prev);
        System.out.println(curr);
        for(int i =0;i<in;i++){
            int sum = prev+curr;
            System.out.println(sum);
            prev = curr;
            curr = sum;
        }

    }
}
