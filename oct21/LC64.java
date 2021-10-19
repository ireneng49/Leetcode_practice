/**
 * 64. All Permutations I
 * Given a string with no duplicate characters, return a list with all permutations of the characters.

Assume that input string is not null.

Examples

Set = “abc”, all permutations are [“abc”, “acb”, “bac”, “bca”, “cab”, “cba”]

Set = "", all permutations are [""]
 */

public class Solution {
    public List<String> permutations(String set) {
      // Write your solution here
      List<String> result = new ArrayList<String>();
      if (set == null) {
        return result;
      }
      char[]array = set.toCharArray();
      helper(array, 0, result);
      return result;
    }
  
    private void helper(char[]array, int index, List<String> result) {
      if (index == array.length) {
        result.add(new String(array));
        return;
    }
      for (int i = index; i < array.length; i++) {
        swap(array, index, i);
        helper(array, index + 1, result);
        swap(array, index, i);
      }
    }
    private void swap(char[]array, int left, int right) {
      char tmp = array[left];
      array[left] = array[right];
      array[right] = tmp;
    }
  }
  