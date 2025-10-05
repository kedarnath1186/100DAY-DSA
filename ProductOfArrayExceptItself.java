class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Left products
        answer[0] = 1;  // nothing on left of first element
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with Right products
        int right = 1; // nothing on right of last element
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
       ProductOfArrayExceptItself sol = new ProductOfArrayExceptItself();
        
        int[] nums = {1,2,3,4};
        int[] result = sol.productExceptSelf(nums);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
