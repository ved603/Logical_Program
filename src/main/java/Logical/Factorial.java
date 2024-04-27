package Logical;
import java.util.Scanner;
public class Factorial {
    public static int fact(int a){
        if(a == 0){
            return 1;
        }
        else{
            return a * fact(a-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();
        System.out.println("The Factorial of a Number is : " +fact(a));
    }
}
