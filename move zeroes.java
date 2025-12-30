class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int slow=0,fast=0;
        while(fast<n){
            if(nums[fast]!=0){
                int temp=nums[slow];
                nums[slow]=nums[fast];
                nums[fast]=temp;
                slow++;
            }
            fast++;
        };
    }
}
