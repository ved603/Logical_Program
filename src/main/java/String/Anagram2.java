package String;

import java.util.ArrayList;
import java.util.Random;

public class Anagram2 {
    public static void main(String[] args) {
        String str = "vedant";
        Random  r = new Random();
        ArrayList <String> s = new ArrayList<>();
        int i=1;
        while(i > 0){
        String a = "";
        while(a.length() < str.length()){
            int index = r.nextInt(str.length());

                if(!a.contains(String.valueOf(str.charAt(index)))) {
                    a += str.charAt(index);
                }
            }
            if(s.contains(a)){
                break;
            }
            s.add(a);
            i++;
        }

        for(int k=0; k<s.size();k++){
            String ab = s.get(k);
            System.out.println(ab);
        }
    }
}
