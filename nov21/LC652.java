class Solution:
    def findDuplicateSubtrees(self, root: Optional[TreeNode]) -> List[Optional[TreeNode]]:
        memo = {}
        res = []
        
        def postorder(root):
            if not root:
                return "#"
            
            left = postorder(root.left)
            right = postorder(root.right)
            
            subtree = left + "," + right + "," + str(root.val)
            
            if subtree not in memo:
                memo[subtree] = 0
            
            if memo[subtree] == 1:
                res.append(root)
            
            memo[subtree] += 1
            return subtree
        
        postorder(root)
        
        return res