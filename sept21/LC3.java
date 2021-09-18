/**3. Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
 */

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        
        int max = 1;
        int ptr = 0;
        for (int i = 1; i< s.length(); i++) {
            // find the first occurence of the char after index ptr
            int index = s.indexOf(s.charAt(i), ptr); 
            if (index < i) { // it means that it is contained in s.substring(ptr, i)
                ptr = index + 1;
            }
            max = Math.max(max, i - ptr + 1);
        }
        
        return max;
    }
}
