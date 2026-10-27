class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        
        int m = nums1.length;
        int n = nums2.length;
        int k = 0;
        int[] ans = new int[m+n];
        while(i < m && j < n) {
            if(nums1[i] > nums2[j]){
                ans[k] = nums2[j];
                k++;
                j++;
            } else{
                ans[k] = nums1[i];
                i++;
                k++;
            }
        }
        while(i < m){
            ans[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            ans[k] = nums2[j];
            j++;
            k++;
        }
        int len = (m + n);
        if(len % 2 != 0){
            return (double) ans[(len)/2];
        }
        return (double) (ans[len/2] + ans[(len/2) - 1]) / 2.0;
    }
}