package String;

public class Reverse {
    public static void main(String[] args) {
        String str = "Sakshi";
        String st = "";
        System.out.println("The Given String is : " +str);
        for(int i= str.length()-1;i>=0;i--){
            st += str.charAt(i);
        }
        System.out.println("The Reverse of the String is : " +st);
    }
}
