import java.util.*;
public class gcd{
    public static void main(String args[])
    {
        int b[]={1,2,3,4,5,6,7,8,9,10};
        int c=maxGCD(b);
System.out.println(c);
    }
    public static int maxGCD(int[] nums) {
        Arrays.sort(nums);
        int b=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                b=Math.max(b,GCD(nums[i],nums[j]));
            }
        }
return(b);
    }
    public static int GCD(int a,int b)
    {
        if(b==0)
        {
            return(a);
        }
        return(GCD(b,a%b));
    }
}