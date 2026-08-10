class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int n : nums) {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int[] res=new int[k];
        Map<Integer, Integer> sortedMap = map.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (a, b) -> a,
                LinkedHashMap::new
        ));
        int i=0;
        for(int key:sortedMap.keySet()){
            if(k==0) break;
            res[i++]=key;
            k--;
        }
        return res;
    }
}
