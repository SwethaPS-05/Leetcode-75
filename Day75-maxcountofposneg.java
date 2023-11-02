class Solution {
    public int maximumCount(int[] nums) {
        int Negative_Count=0;
        int Positive_Count=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]<0){
            Negative_Count++;
        }
        else if(nums[i]>0){
            Positive_Count++;
        }
        }
        int ans = Math.max(Negative_Count, Positive_Count);
        return ans;
    }
}
