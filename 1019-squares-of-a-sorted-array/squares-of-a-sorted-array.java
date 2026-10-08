class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length -1 ;
        int index =nums.length -1;
        int[] arr=new int[j+1];
        while(i<=j)
        {
            int leftsquare=nums[i]*nums[i];
            int rightsquare= nums[j]*nums[j];
            if(leftsquare<rightsquare)
            {
                arr[index]=rightsquare;
                j--;
            }
            else
            {
                arr[index]=leftsquare;
                i++;
            }
            index--;
        }
        return arr;
    }
}