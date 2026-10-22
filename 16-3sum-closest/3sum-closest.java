class Solution 
{
    public int threeSumClosest(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int result;
        int closest=nums[0]+nums[1]+nums[2];
        for(int i =0;i<nums.length -2 ;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            int diff;
            while(left<right)
            {
                int sum=nums[left]+nums[right]+nums[i];
                if(Math.abs(target-sum)<Math.abs(target-closest))
                {
                    closest = sum;
                }
                else if(sum<target)
                {
                    left++;
                }
                else if (sum>target)
                {
                    right--;
                }
                else 
                {
                    return sum;
                }
            }
        }
        return closest;
    }
}