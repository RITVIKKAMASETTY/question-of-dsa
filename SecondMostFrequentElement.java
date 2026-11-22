import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int secondMostFrequentElement(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<>();
     int max=0,maxnum=-1,secmax=0,secmaxnum=-1;
     for(int i=0;i<nums.length;i++)
     {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     }
     for(Map.Entry<Integer,Integer> it:map.entrySet())
     {
        int ele=it.getKey();
        int freq=it.getValue();
        if(freq>max)
        {
            secmax=max;
            max=freq;
            secmaxnum=maxnum;
            maxnum=ele;
        }
        else if(freq==max)
        {
            maxnum=Math.min(maxnum,ele);
        }
        else if(freq> secmax)
        {
            secmax=freq;
            secmaxnum=ele;
        }
        else if(freq==secmax)
        {
            secmaxnum=Math.min(secmaxnum,ele);
        }
     }
     return(secmaxnum);
    }
}

{

}
