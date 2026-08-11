class Solution {
    public boolean isPalindrome(String s) {
      s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String m=sb.toString();
        int i = 0;
        int j = m.length() - 1;
        while (i < j) {
            char c1=m.charAt(i);
            char c2=m.charAt(j);
            if (c1 != c2) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
