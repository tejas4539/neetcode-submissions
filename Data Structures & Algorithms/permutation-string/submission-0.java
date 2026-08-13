class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        int n = s1.length();
        int m = s2.length();
        for (int i = 0; i <= m - n; i++) {
            String sub = s2.substring(i, i+n);
            if (isPermutation(sub, s1)) {
                return true;
            }
        }
        return false;
    }
    public boolean isPermutation(String s1, String s2) {
        int[] a1 = new int[26];
        for (char ch : s2.toCharArray()) {
            a1[ch - 'a']++;
        }
        for (char ch : s1.toCharArray()) {
            a1[ch - 'a']--;
        }
        for (int n : a1) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
