class Solution {
    public boolean isHappy(int n) {
        String s=n+"";
        int res=n;
        List<Integer> li=new ArrayList<>();
        if(n==1) return true;
        while(!li.contains(res)){
            li.add(res);
            res=sumSquare(res);
            s=res+"";
            if(res==1){return true;}

        }
        return false;
    }
    public int sumSquare(int n){
        int sum=0;
        while(n!=0){
            int k=n%10;
            sum=(k*k)+sum;
            n=n/10;
        }
        return sum;
    }
}
