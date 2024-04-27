package String;

import java.util.ArrayList;
import java.util.HashMap;

public class Compression {
    public static void main(String[] args) {
        String a = "aabbbccc";
        HashMap<Character,Integer> hm = new HashMap<>();
        ArrayList <Character> b = new ArrayList<>();
        for(int i=0;i<a.length();i++){
            int count =0;
            if(hm.containsKey(a.charAt(i))){
                count = hm.get(a.charAt(i));
            }
            if(!b.contains(a.charAt(i))){
                b.add(a.charAt(i));
            }

            hm.put(a.charAt(i),count+1);
        }

        ArrayList<Integer> c = new ArrayList<>(hm.values());
        int i = 0;
        while(i < b.size()){
            System.out.print(b.get(i));
            System.out.print(c.get(i));
            i++;
        }
    }
}
