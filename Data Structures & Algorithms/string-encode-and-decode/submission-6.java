class Solution {
    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        if(strs.size()==0) return null;

        for (String str : strs) {
            s.append(str.length()).append("#").append(str);
        }

        return s.toString();
    }

    public List<String> decode(String str) {
         List<String> s = new ArrayList<>();
        if(str == null) return s;
        int i = 0;
        while (i < str.length()) {
            int slash = str.indexOf('#', i);
            int size = Integer.parseInt(str.substring(i, slash));
            i = slash + 1 + size;
            s.add(str.substring(slash + 1, i));
        }
        return s;
    }
}