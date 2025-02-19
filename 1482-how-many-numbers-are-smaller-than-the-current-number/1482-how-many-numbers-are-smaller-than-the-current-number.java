class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] hash=new int[101];
        for(int num : nums){
            hash[num]++;
        }
        for(int i=1;i<101;i++){
            hash[i]=hash[i]+hash[i-1];
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                result[i]=0;
            }
            else{
                result[i]=hash[nums[i]-1];
            }
        }
        return result;
    }
}