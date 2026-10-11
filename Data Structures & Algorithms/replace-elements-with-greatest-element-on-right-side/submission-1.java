class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int greatest=-1;
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--){ 
            res[i]=greatest;
            greatest=Math.max(greatest,arr[i]);
        }
        return res;
    }
}