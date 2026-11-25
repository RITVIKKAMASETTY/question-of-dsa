public class IsomorhicString {
    public boolean isomorphicString(String s, String t) {
        // your code goes here
        if (s.length() != t.length()) {
            return (false);
        }
        int map1[] = new int[256];
        int map2[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            int char1 = s.charAt(i);
            int char2 = t.charAt(i);
            if (map1[char1] != map2[char2]) {
                return (false);
            }
            map1[char1] = i + 1;
            map2[char2] = i + 1;
        }
        return (true);
    }
}
// Given two strings s and t, determine if they are isomorphic. Two strings s
// and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while
// preserving the order of characters. No two characters may map to the same
// character, but a character may map to itself.

// Example 1:
// Input : s = "egg" , t = "add"

// Output : true

// Explanation :

// The 'e' in string s can be replaced with 'a' of string t.

// The 'g' in string s can be replaced with 'd' of t.

// Hence all characters in s can be replaced to get t.

// Example 2:
// Input : s = "apple" , t = "bbnbm"

// Output : false

// Explanation :

// Strings are matched index by index.

// At index 0, 'a' maps to 'b'.

// At index 1, 'p' also maps to 'b'.

// This is invalid because two different characters (a and p) cannot map to the
// same character (b) in a one-to-one mapping.

// Therefore, no valid mapping exists and the output is false.

// Example 3:
// Input : s = "paper" , t = "title"

// Output:
// true
