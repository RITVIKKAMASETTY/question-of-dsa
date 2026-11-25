package binarySerach;

public class minimumRateToEatBananas {
    public int minimumRateToEatBananas(int[] nums, int h) {
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        int start=1,end=max;
        while(start<=end)
        {int mid=start+(end-start)/2;
            long hours=findhours(nums,mid);
            if(hours<=h)
            {
            end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }return(start);
    }
    public long findhours(int nums[],int n)
    {long hours=0,div=0;
        for(int i=0;i<nums.length;i++)
        {
            hours+=(long)(nums[i] / n);
            if(nums[i]%n!=0)
            {
               hours++;
            }
        }return(hours);
    }
}
// A monkey is given n piles of bananas, where the 'ith' pile has nums[i] bananas. An integer h represents the total time in hours to eat all the bananas.

// Each hour, the monkey chooses a non-empty pile of bananas and eats k bananas. If the pile contains fewer than k bananas, the monkey eats all the bananas in that pile and does not consume any more bananas in that hour.

// Determine the minimum number of bananas the monkey must eat per hour to finish all the bananas within h hours.

// Example 1:
// Input: n = 4, nums = [7, 15, 6, 3], h = 8

// Output: 5

// Explanation: If Koko eats 5 bananas/hr, he will take 2, 3, 2, and 1 hour to eat the piles accordingly. So, he will take 8 hours to complete all the piles.  

// Example 2:
// Input: n = 5, nums = [25, 12, 8, 14, 19], h = 5

// Output: 25

// Explanation: If Koko eats 25 bananas/hr, he will take 1, 1, 1, 1, and 1 hour to eat the piles accordingly. So, he will take 5 hours to complete all the piles.

// Example 3:
// Input: n = 4, nums = [3, 7, 6, 11], h = 8

// Output:
// 4