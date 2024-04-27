package Logical;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();
        int rev = 0 ;
        int temp=a;
        while(a > 0){
            rev = rev * 10  + a%10;
            a = a/10;
        }
        //System.out.println(a);

        if(temp == rev){
            System.out.println("The Given Number is Palindrome");
        }
        else{
            System.out.println("The Given Number is Not a Palindrome");
        }
    }
}
