import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String a = "";
        generate(list, 0, 0, 0, n, a);
        return (list);
    }

    public void generate(List<String> list, int i, int open, int close, int n, String a) {
        if (close > open || i > 2 * n) {
            return;
        }
        if (i == 2 * n && open == close) {
            list.add(a);
        }
        generate(list, i + 1, open + 1, close, n, a + '(');
        if (open > close) {
            generate(list, i + 1, open, close + 1, n, a + ')');
        }
    }
}
// Given an integer n.Generate all possible combinations of well-formed
// parentheses of length 2 x N.

// Example 1:
// Input : n = 3

// Output : [ "((()))" , "(()())" , "(())()" , "()(())" , "()()()" ]

// Example 2:
// Input : 2

// Output : [ "(())" , "()()" ]