import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int left = 0, max = 0;

        for(int right = 0; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        System.out.println(max);
    }
}