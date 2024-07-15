class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                return nums[i];
            }
        }
        return nums[i];
    }
}