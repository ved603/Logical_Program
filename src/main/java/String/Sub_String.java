package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Sub_String {
    public static void main(String[] args) {
        String str = "vedant";
        Random r = new Random();
        ArrayList<String> s = new ArrayList<>();
        int i=1;
        while(i > 0){
            String a = "";
            int p = r.nextInt(str.length());
            while(a.length() < p){
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
        int max = 0;
        System.out.print("The All Sub Strings are : " );
        for(int k=0; k<s.size();k++){
            String a = s.get(k);
            System.out.print(a + " ,  ");
            if(a.length() > max){
                max = k;
            }
        }
        System.out.println();
        System.out.println("The Max Sub String is : " +s.get(max));
    }
}
