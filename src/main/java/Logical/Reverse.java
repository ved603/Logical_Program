package Logical;

public class Reverse {
    public static void main(String[] args) {
        int a = 123;
        System.out.println("The Given Number is : " +a);
        int res = 0;
        while(a > 0){
            res = res*10 + a%10;
            a = a/10;
        }
        System.out.println("The Reverse of a Number is : " +res);
    }
}
