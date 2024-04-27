package Logical;

public class armstrong {
    public static void main(String[] args) {
        int a = 153;
        int b = a;
        int sum = 0;
        while(a > 0){
            sum += (int) Math.pow((a%10),3);
            a = a/10;
        }

        if(sum == b){
            System.out.println("The Given Number is armstrong Number");
        }
        else{
            System.out.println("The Number is not armstrong Number");
        }
    }
}
