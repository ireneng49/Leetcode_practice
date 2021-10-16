/**
 * 51. Insert In Binary Search Tree
 * Insert a key in a binary search tree if the binary search tree does not already contain the key. Return the root of the binary search tree.

Assumptions

There are no duplicate keys in the binary search tree

If the key is already existed in the binary search tree, you do not need to do anything

Examples

        5

      /    \

    3        8

  /   \

 1     4

insert 11, the tree becomes

        5

      /    \

    3        8

  /   \        \

 1     4       11

insert 6, the tree becomes

        5

      /    \

    3        8

  /   \     /  \

 1     4   6    11


 */

public class Solution {
    public TreeNode insert(TreeNode root, int key) {
      // Write your solution here
      if (root == null) {
        return new TreeNode(key);
      }
      TreeNode cur = root;
      while (cur.key != key) {
        if (key < cur.key){
          if (cur.left == null) {
            cur.left = new TreeNode(key);
          }
          cur = cur.left;
        } else {
          if (cur.right == null) {
            cur.right = new TreeNode(key);
          }
          cur = cur.right;
        }
      }
      return root;
    }
  }
  