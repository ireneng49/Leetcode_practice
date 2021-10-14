/**
 * 60. Height of Binary Tree
 * Find the height of binary tree.

Examples:

        5

      /    \

    3        8

  /   \        \

1      4        11

The height of above binary tree is 3.

How is the binary tree represented?

We use the level order traversal sequence with a special symbol "#" denoting the null node.

For Example:

The sequence [1, 2, 3, #, #, 4] represents the following binary tree:

    1

  /   \

 2     3

      /

    4  
 */
public class Solution {
    public int findHeight(TreeNode root) {
      // Write your solution here
  
      if (root == null) {
        return 0;
      }
  
      return Math.max(findHeight(root.left),findHeight(root.right))+1;
    }
  }