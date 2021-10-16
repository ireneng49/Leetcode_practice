/**
 * 52. Search In Binary Search Tree
 * Find the target key K in the given binary search tree, return the node that contains the key if K is found, otherwise return null.

Assumptions

There are no duplicate keys in the binary search tree

 */

public class Solution {
    public TreeNode search(TreeNode root, int key) {
      // Write your solution here
  
      if(root == null || root.key == key) {
        return root;
      }
      return search(key < root.key ? root.left : root.right, key);
    }
  }
  