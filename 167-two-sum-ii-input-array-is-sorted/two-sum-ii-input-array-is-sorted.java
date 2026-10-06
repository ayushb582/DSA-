class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int strt=0;
        int end =numbers.length-1;
        while(strt<end)
        {
           int sum=numbers[strt]+numbers[end];
           if(sum==target)
           {
            return new int[]{strt + 1, end + 1};
           }
           else if (sum<target)
           {
            strt++;
           }
           else{
           end--;
           }
        }
        return new int[]{};
    }
}