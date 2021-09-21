/**
 * 5. Longest Palindromic Substring
 * Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
Example 3:

Input: s = "a"
Output: "a"
Example 4:

Input: s = "ac"
Output: "a"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
 */

public String longestPalindrome(String s) {
    int max = 0, idx = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = extend(s, i, i), len2 = extend(s, i, i + 1);
        if (max < Math.max(len1, len2)) {
            idx = (len1 > len2) ? (i - len1 / 2) : (i - len2 / 2 + 1);
            max = Math.max(len1, len2);
        }
    }
    return s.substring(idx, idx + max);
}

private int extend(String s, int i, int j) {
    for (; i >= 0 && j < s.length(); i--, j++)
        if (s.charAt(i) != s.charAt(j))
            break;
    return j - i - 2 + 1; // 2 means current two unmatched char
}
