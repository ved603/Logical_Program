package String;

import java.util.*;

public class Anangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Main String : ");
        String str = sc.next();
        System.out.println("Enter the Anagram String : ");
        String str1 = sc.next();

        ArrayList<Character> s = new ArrayList<>();


        if (str.length() == str1.length()) {
            for (int i = 0; i < str.length(); i++) {
                s.add(Character.toLowerCase(str.charAt(i)));
            }
            for (int j = 0; j < str1.length(); j++) {
                char c = str1.charAt(j);
                if (!s.contains(c)) {
                    System.out.println("The String is Not Anagram");
                }
            }
            System.out.println("The Given String is Anagram");
        }
    }





}
