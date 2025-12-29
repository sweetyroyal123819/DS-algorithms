class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] freq=new int[n+1];
        for(int num:nums){
            freq[num]++;
        }
        int d=-1,m=-1;
        for(int i=1;i<n+1;i++){
            if(freq[i]==2)d=i;
            else if(freq[i]==0)m=i;
        }
        return new int[]{d,m};
        
    }
}
