class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int i=0;
        int n=heights.length;
        int j=n-1;
        while(i<j){
            int wat=Math.min(heights[i],heights[j]);
            int total=wat*(j-i);
            max=Math.max(total,max);
            if(heights[i]> heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}
