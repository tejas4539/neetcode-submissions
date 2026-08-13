class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int leftMax=0;
        int rightMax=0;  
        for(int i=0;i<n;i++){
            leftMax=Math.max(leftMax,height[i]);
            left[i]=leftMax;
        }
        for(int i=n-1;i>=0;i--){
            rightMax=Math.max(rightMax,height[i]);
            right[i]=rightMax;
        }
        int count=0;
        for(int i=0;i<n;i++){
            int min=Math.min(left[i],right[i]);
            int diff=min-height[i];
            if(diff>0){
                count+=diff;
            }
        }
        return count;
    }
}
