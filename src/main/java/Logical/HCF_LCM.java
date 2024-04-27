package Logical;

public class HCF_LCM {
    static int hcf(int num1,int num2){
        int temp =0 ;
        while(num2 != 0){
            temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;
    }
    static int lcm(int num1,int num2,int hcf){
        return (num1*num2)/hcf;
    }
    public static void main(String[] args) {
        int num1,num2;
        int hcf,lcf;
        num1 = 10;
        num2 = 35;
        hcf = hcf(num1,num2);
        lcf = lcm(num1,num2,hcf);
        System.out.println("The First Number is : " +num1);
        System.out.println("The Second Number is : " +num2);
        System.out.println("The HCF of two number is : " +hcf);
        System.out.println("The LCM of two Number is :" +lcf);
    }
}
