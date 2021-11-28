public class sol {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack1 = new ArrayDeque<>();
        Deque<TreeNode> stack2 = new ArrayDeque<>();
        TreeNode curr = root1;
        while (curr != null) {
            stack1.push(curr);
            curr = curr.left;
        }
        curr = root2;
        while (curr != null) {
            stack2.push(curr);
            curr = curr.left;
        }
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            TreeNode node1 = null;
            TreeNode node2 = null;
            if (!stack1.isEmpty()) {
                node1 = stack1.peek();
            }
            if (!stack2.isEmpty()) {
                node2 = stack2.peek();
            }
            if ((node1 != null && node2 != null && node1.val < node2.val) || node2 == null) {
                result.add(node1.val);
                node1 = stack1.pop().right;
                while(node1 != null) {
                    stack1.push(node1);
                    node1 = node1.left;
                }
            }
            else if ((node1 != null && node2 != null && node2.val <= node1.val) || node1 == null){
                result.add(node2.val);
                node2 = stack2.pop().right;
                while(node2 != null) {
                    stack2.push(node2);
                    node2 = node2.left;
                }
            }
        }
        return result;
    }
}