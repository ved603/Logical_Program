package Logical;

public class BinToDec {
    public static void main(String[] args) {
        int bin = 101101;
        int dec = 0;
        int i = 0;
        System.out.println("The Binary Number is : " +bin);
        while(bin > 0){
            if(bin%10 == 1){
                dec += (int) Math.pow(2,i);
            }
            bin = bin/10;
            i++;
        }
        System.out.println("The Number in Decimal Form is : " +dec);
    }
}
