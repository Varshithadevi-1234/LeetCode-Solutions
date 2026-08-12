class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++){
            result=nums[i]+nums[j];
           if(result==target)
                    return new int[]{i, j};
          }
        }
                            return new int[]{-1, -1};

    }
}