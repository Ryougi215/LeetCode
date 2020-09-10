class Solution {
    fun sortedListToBST(head: ListNode?): TreeNode? {
        return buildTree(head, null)
    }

    private fun middleNum(left: ListNode?, right: ListNode?): ListNode {
        var fast = left
        var slow = left

        while (fast != right && fast?.next != right) {
            fast = fast?.next
            fast = fast?.next
            slow = slow?.next
        }
        return slow!!
    }

    private fun buildTree(left: ListNode?, right: ListNode?): TreeNode? {
        if (left == right) {
            return null
        }

        val middle = middleNum(left, right)
        val root = TreeNode(middle.`val`)

        root.left = buildTree(left, middle)
        root.right = buildTree(middle.next, right)

        return root
    }
}