class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";

        if (strs.length == 0)
            return ans;

        if (strs.length == 1)
            return strs[0];

        int n = strs[0].length();

        // Find minimum string length
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < n) {
                n = strs[i].length();
            }
        }

        // Compare characters column by column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    return ans;
                }
            }
            ans += strs[0].charAt(i);
        }

        return ans;
    }
}