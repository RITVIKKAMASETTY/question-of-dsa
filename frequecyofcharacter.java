import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class frequecyofcharacter {
    public List<Character> frequencySort(String s) {
        List<Character> list = new ArrayList<>();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> it : map.entrySet()) {
            list.add(it.getKey());
        }
        list.sort((a, b) -> {
            if (map.get(a) != map.get(b)) {
                return (map.get(b) - map.get(a));
            }
            return Character.compare(a, b);
        });
        return (list);
    }
// }You are given a string s. Return the array of unique characters, sorted by
// highest to lowest occurring characters.

// If two or more characters have same frequency then arrange them in alphabetic
// order.

// Example 1:
// Input : s = "tree"

// Output : ['e', 'r', 't' ]

// Explanation :

// The occurrences of each character are as shown below :

// e --> 2

// r --> 1

// t --> 1.

// The r and t have same occurrences , so we arrange them by alphabetic order.

// Example 2:
// Input : s = "raaaajj"

// Output : ['a' , 'j', 'r' ]

// Explanation :

// The occurrences of each character are as shown below :

// a --> 4

// j --> 2

// r --> 1