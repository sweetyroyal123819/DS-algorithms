class Solution {
    public int climbStairs(int n) {
        int a=1,b=2;
        if(n<2)return n;
        for(int i=2;i<n;i++){
            int temp=a;
            a=b;
            b=temp+a;
        }
        return b;
        
    }
}
