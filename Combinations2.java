class powerset {
    public List<List<Integer>> powerSet(int[] nums) {
        // your code goes here
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        generate(list, current, nums, 0);
        return (list);
    }

    public void generate(List<List<Integer>> list, List<Integer> current, int nums[], int i) {
        if (i == nums.length) {
            list.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        generate(list, current, nums, i + 1);
        current.remove(current.size() - 1);
        generate(list, current, nums, i + 1);
    }
// }Given an array of integers nums of unique elements. Return all possible subsets (power set) of the array.

// Do not include the duplicates in the answer.

// Example 1:
// Input : nums = [1, 2, 3]

// Output : [ [ ] , [1] , [2] , [1, 2] , [3] , [1, 3] , [2, 3] , [1, 2 ,3] ]

// Example 2:
// Input : nums = [1, 2]

// Output : [ [ ] , [1] , [2] , [1,2] ]