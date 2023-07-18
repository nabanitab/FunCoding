package LeetCode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        // Test case 1
        String[] strs1 = {"flower", "flow", "flight"};
        String result1 = solution.longestCommonPrefix(strs1);
        System.out.println("Longest common prefix: " + result1);

        // Test case 2
        String[] strs2 = {"dog", "racecar", "car"};
        String result2 = solution.longestCommonPrefix(strs2);
        System.out.println("Longest common prefix: " + result2);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}


