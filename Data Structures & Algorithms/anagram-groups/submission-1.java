class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<List<Character>, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            List<Character> li =
                new String(ch).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            if (!map.containsKey(li)) {
                map.put(li, new ArrayList<>());
            }
            map.get(li).add(s);
        }
        for (List<String> values : map.values()) {
            res.add(values);
        }
        return res;
    }
}
