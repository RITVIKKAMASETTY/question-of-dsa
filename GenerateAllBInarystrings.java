import java.util.ArrayList;
import java.util.List;

public class GenerateAllBinaryStrings{
    public List<String> generateBinaryStrings(int n) {
        // Your code goes here
        List<String> list=new ArrayList<>();
        generate(list,n,"");
        return(list);
    }
    public void generate(List<String> list,int n,String a)
    {
        if(a.length()==n)
        {
            list.add(a);
            return;
        }
        generate(list,n,a+'0');
        if( a.length()==0|| a.charAt(a.length()-1)!='1')
        {
            generate(list,n,a+'1');
        }
// Given an integer n, return all binary strings of length n that do not contain consecutive 1s. Return the result in lexicographically increasing order.

// A binary string is a string consisting only of characters '0' and '1'.

// Example 1:
// Input: n = 3

// Output: ["000", "001", "010", "100", "101"]

// Explanation: All strings are of length 3 and do not contain consecutive 1s.

// Example 2:
// Input: n = 2

// Output: ["00", "01", "10"]
