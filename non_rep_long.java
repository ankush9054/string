import java.util.*;

public class non_rep_long {

    static int substring(String s) {
        int sit = 0;
        int move = 0;
        int max = 0;

        HashSet<Character> hs = new HashSet<>();
        while (move < s.length()) {
            if (!hs.contains(s.charAt(move))) {
                hs.add(s.charAt(move));
                move++;
                max = Math.max(hs.size(), max);
            } else {
                hs.remove(s.charAt(sit));
                sit++;
            }
        }
        return max;

    }

    public static void main(String[] args) {

        System.out.println(substring("abcabcbb"));

    }
}
