class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Set<List<Integer>> res = new HashSet<>();
        int i = 0;
        int n = nums.length;
        Arrays.sort(nums);
        while (i < n - 2) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[j], nums[k]);
                    res.add(li);
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                }
            }
            i++;
        }
        return new ArrayList<List<Integer>>(res);
    }
}
