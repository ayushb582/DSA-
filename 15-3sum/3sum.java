import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        HashSet<List<Integer>> ans =new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i+1;j<nums.length;j++)
            {

                int complement = -(nums[i]+nums[j]);
                if(map.containsKey(complement))
                {
                    ans.add(Arrays.asList(nums[i],nums[j],complement));
                    
                }
                map.put(nums[j],j);
            }

        }
        return new ArrayList<>(ans);
    }
}