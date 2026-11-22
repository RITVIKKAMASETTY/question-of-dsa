class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int llen = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                llen = Math.max(llen, i + 1);
            }
            if (map.containsKey(sum - k)) {
                llen = Math.max(llen, i - map.get(i));
            }
            if (!map.contains(sum)) {
                map.put(sum, i);
            }
        }
        return (llen);
    }
}