class SubsequenceSum {
    public boolean checkSubsequenceSum(int[] nums, int k) {
        // your code goes here
        boolean a = check(nums, k, 0, 0);
        return (a);
    }

    public boolean check(int nums[], int k, int i, int sum) {
        if (sum == k) {
            return (true);
        }
        if (i == nums.length) {
            return (false);
        }
        return (check(nums, k, i + 1, sum + nums[i]) || check(nums, k, i + 1, sum));
    }
}