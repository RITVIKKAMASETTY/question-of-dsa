public class NumberOfSubsequence {
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
          //your code goes here
         int a=check(nums,k,0,0);return(a);
    }
    public int check(int nums[],int k,int i,int sum)
    {
        if(i==nums.length)
        {
            if(sum==k)
            {
                return(1);
            }
            return(0);
        }
       int pick=(check(nums,k,i+1,sum+nums[i]));
       int notpick=(check(nums,k,i+1,sum));
       return(pick+notpick);
    }
}{

}
