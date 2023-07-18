package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithOutRepeatingCh {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {

            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);

            } else {
                while (s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithOutRepeatingCh solution = new LongestSubstringWithOutRepeatingCh();

        String s1 = "abcabcbb";
        int maxLength1 = solution.lengthOfLongestSubstring(s1);
        System.out.println("Length of the longest substring without repeating characters in '" + s1 + "': " + maxLength1);

        String s2 = "bbbbb";
        int maxLength2 = solution.lengthOfLongestSubstring(s2);
        System.out.println("Length of the longest substring without repeating characters in '" + s2 + "': " + maxLength2);

        String s3 = "pwwkew";
        int maxLength3 = solution.lengthOfLongestSubstring(s3);
        System.out.println("Length of the longest substring without repeating characters in '" + s3 + "': " + maxLength3);
    }
}

