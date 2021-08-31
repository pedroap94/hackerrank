package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if (a.isEmpty() || b.isEmpty()){
            throw new IllegalArgumentException();
        }
        boolean anagram = false;
        char [] achar = a.toUpperCase().toCharArray();
        char [] bchar = b.toUpperCase().toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < achar.length; i++){
            if(!map.containsKey(achar[i])){
                map.put(achar[i],1);
            } else {
                int value = map.get(achar[i]);
                map.put(achar[i], value+1);
            }
        }

        for(int i = 0; i < bchar.length; i++){
            if(!map.containsKey(bchar[i])){
                anagram = false;
                break;
            } else {
                int value = map.get(bchar[i]);
                if (value == 0){
                    anagram = false;
                    break;
                }
                map.put(bchar[i], value-1);
            }
            anagram = true;
        }
        return anagram;


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
