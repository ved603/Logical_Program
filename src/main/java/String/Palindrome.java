package String;

public class Palindrome {
    public static void main(String[] args) {
        String str = "MAM";
        String st = "";
        for(int i= str.length()-1;i>=0;i--){
            st += str.charAt(i);
        }
        if(str.equals(st)){
            System.out.println("The Given String is Palindrome");
        }
        else{
            System.out.println("The Given String is not a Palindrome");
        }
    }
}
