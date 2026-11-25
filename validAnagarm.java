public class validAnagarm{  
    public boolean anagramStrings(String s, String t) {
        //your code goes here
        if(s.length()!=t.length()){return(false);}
    long map[]=new long[256];
        for(int i=0;i<s.length();i++)
        {
            map[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++)
        {
            map[t.charAt(i)]--;
        }for(int i=0;i<map.length;i++){if(map[i]!=0){return(false);}}return(true);
    }
// }Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Example 1:
// Input : s = "anagram" , t = "nagaram"

// Output : true

// Explanation :

// We can rearrange the characters of string s to get string t as frequency of all characters from both strings is same.

// Example 2:
// Input : s = "dog" , t = "cat"

// Output : false

// Explanation :

// We cannot rearrange the characters of string s to get string t as frequency of all characters from both strings is not same.

// Now Your Turn!
// Pick the correct output for the given input
// Input : s = "eat" , t = "tea"


// true

// false
// Still unsure what the problem is asking ?

// Let’s go through a few more examples, step by step, to make it clearer.

// Constraints:
// 1 <= s.length , t.length <= 5*104
// s and t consist of only lowercase English letters