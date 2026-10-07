class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = 0;
        int i = 0;
        int j = 0;

        int[] arr = new int[m+n];

        while(i < m && j < n)
        {
            if(nums1[i] <= nums2[j])
            {
                arr[c] = nums1[i];
                i++;
            }
            else
            {
                arr[c] = nums2[j];
                j++;
            }
            c++;
        }

        while(i < m)
        {
            arr[c] = nums1[i];
            i++;
            c++;
        }

        while(j < n)
        {
            arr[c] = nums2[j];
            j++;
            c++;
        }

        for(int x = 0; x < m+n; x++)
        {
            nums1[x] = arr[x];
        }
    }
}