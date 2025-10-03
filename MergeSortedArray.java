class MergeSortedArray {
    public static void main(String [] args){
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;  // number of valid elements in nums1
        int [] nums2 = {2,5,6};
        int n = 3;  // number of elements in nums2

        MergeSortedArray sol = new MergeSortedArray();
        sol.merge(nums1, m, nums2, n);

        for (int i = 0; i < m+n; i++){
            System.out.print(nums1[i] + " ");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;   // last element in nums1’s valid part
        int j = n - 1;   // last element in nums2
        int k = m + n - 1; // last index of nums1

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
