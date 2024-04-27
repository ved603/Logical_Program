package String;

public class Reverse_Words {

    static String reverse(String a){
        String s = "";
        for(int i=a.length()-1;i>=0;i--){
            s += a.charAt(i);
        }
        return s;


    }
    public static void main(String[] args) {
        String str = "I Love my friends";
        String []a = str.split(" ");
        String [] b = new String[a.length];
        for(int i=0;i<a.length;i++){
            b[i] = reverse(a[i]);
        }
        System.out.println("The Given String is : " +str);
        for(int i=0;i <b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}