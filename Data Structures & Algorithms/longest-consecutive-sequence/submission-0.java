class Solution {
    public int longestConsecutive(int[] nums) {
         Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int start = -1;
        int max=0;
        for (int n : nums) {
            if (!set.contains(n - 1)) {
                start = n;
                int i = 1;
                int j = 1;
                while (true) {
                    if (!set.contains(start + j)) {
                        break;
                    }
                    j++;
                    i++;
                }
                max=Math.max(i,max);
            }
        }
        //System.out.println(start+" "+set);

        return max;
    }
}
