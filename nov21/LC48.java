/**
 * 48. Symmetric Binary Tree
 * Check if a given binary tree is symmetric.

Examples

        5

      /    \

    3        3

  /   \    /   \

1      4  4      1

is symmetric.

        5

      /    \

    3        3

  /   \    /   \

1      4  1      4

is not symmetric.

Corner Cases

What if the binary tree is null? Return true in this case.
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
    public boolean isSymmetric(TreeNode root) {
      if (root == null) {
        return true;
      }
      return isSymmetric(root.left, root.right);
    }
  
    private boolean isSymmetric(TreeNode one, TreeNode two) {
      if (one == null && two == null) {
        return true;
      } else if (one == null || two == null) {
        return false;
      } else if (one.key != two.key) {
        return false;
      }
      return isSymmetric(one.left, two.right) && isSymmetric(one.right, two.left);
    }
  }
  