class Solution {
    public int removeElement(int[] nums,int  val) {
        int n=nums.length;
        int slow=0,fast=0;
        while(fast<n){
            if(nums[fast]!=val){
                int temp=nums[slow];
                nums[slow]=nums[fast];
                nums[fast]=temp;
                slow++;
            }
            fast++;
        }
        return slow;
        
    }
}
