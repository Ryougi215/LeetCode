import kotlin.math.min

class Solution {
    fun minDepth(root: TreeNode?): Int {
        if(root == null) {
            return 0
        }

        if (root.left == null && root.right == null) {
            return 1
        }

        var depth = Int.MAX_VALUE
        if (root.left != null) {
            depth = min(depth, minDepth(root.left))
        }
        if (root.right != null) {
            depth = min(depth, minDepth(root.right))
        }

        return depth + 1
    }
}