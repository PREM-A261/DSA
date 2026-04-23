import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
 public static void main(String[] args) {
        String s = "abcdabcbb";
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            int window = right - left + 1;
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, window);
        }

        System.out.println(maxLength);

    }   
}
