package String;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        int sum = 0;
        String str1 = "";
        for(int i=0;i<str.length();i++){
            try{
                int a = Integer.parseInt(String.valueOf(str.charAt(i)));
                str1 += a;
            }
            catch (Exception e) {
                sum += str.charAt(i);
            }
        }
        System.out.println(str);
        System.out.println("The SubString from main String which is only made up of Digits is : " +str1);
        int b = Integer.parseInt(str1);
        System.out.println("Value of Character Sub String from Main String is : " +sum);
        System.out.println("The Value of Digits Substring is : " +b);
        System.out.println("The Value of Main String is : " +(sum+b));

    }
}
