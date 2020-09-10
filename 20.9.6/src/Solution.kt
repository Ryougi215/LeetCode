import java.util.concurrent.LinkedBlockingQueue
import kotlin.collections.ArrayList

class Solution {
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val result = ArrayList<ArrayList<Int>>()

        if (root == null) {
            return result
        }

        val queue = LinkedBlockingQueue<TreeNode>()
        queue.offer(root)

        while (!queue.isEmpty()) {
            val size = queue.size
            val level = ArrayList<Int>()
            for (i in 0 until size) {
                val node = queue.poll()
                level.add(node.`val`)

                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }
            result.add(0, level)
        }
        return result
    }
}