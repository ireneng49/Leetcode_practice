/**
 * 654. In-order Traversal Of Binary Tree (recursive)
 * Implement a recursive, in-order traversal of a given binary tree, return the list of keys of each node in the tree as it is in-order traversed.

Examples

        5

      /    \

    3        8

  /   \        \

1      4        11

In-order traversal is [1, 3, 4, 5, 8, 11]

Corner Cases

What if the given binary tree is null? Return an empty list in this case.
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
    public List<Integer> inOrder(TreeNode root) {
      // Write your solution here
      List<Integer> res = new ArrayList<>();
      helper(root, res);
      return res;
    }
  
    private void helper(TreeNode root, List<Integer> res){
      if (root == null){
        return;
      }
      helper(root.left, res);
      res.add(root.key); 
      helper(root.right, res);
    
    }
  }