class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            System.out.print(nums[i]);
        }
    }
}