class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int count=nums[0];
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]+1==nums[i+1])
            {
                count+=nums[i+1];
            }
            else
            {
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(count==nums[i])
            {
                count++;
                i=-1;
            }
        }
              return count;
    }
}