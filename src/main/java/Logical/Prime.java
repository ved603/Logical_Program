package Logical;
import java.util.Scanner;
public class Prime {

    public static Boolean isprime(int a){
        if(a == 0 || a == 1){
            return false;
        }
        else if(a==2 || a == 3){
            return true;
        }
        else if(a%2 ==0 || a%3 ==0){
            return false;
        }
        else{
            for(int i=5;i<a/2;i++){
                if(a%i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to check for prime : ");
        int a = sc.nextInt();
        if(isprime(a)){
            System.out.println("The Given Number is Prime Number");
        }
        else{
            System.out.println("The Given Number is not a Prime Number");
        }
    }
}
