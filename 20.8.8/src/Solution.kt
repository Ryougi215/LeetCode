import kotlin.collections.ArrayList

class Solution {
    fun recoverTree(root: TreeNode?) {
        root?.let {
            val sort = ArrayList<Int>()
            add2Array(it, sort)
            sort.sort()
            replace(it,sort)
        }
    }

    private fun add2Array(node: TreeNode, array: ArrayList<Int>) {
        array.add(node.`val`)
        node.left?.let { add2Array(it, array) }
        node.right?.let { add2Array(it, array) }
    }

    private fun replace(node: TreeNode, array: ArrayList<Int>) {
        node.left?.let {
            replace(it, array)
        }
        node.`val` = array[0]
        array.removeAt(0)

        node.right?.let {
            replace(it, array)
        }
    }
}