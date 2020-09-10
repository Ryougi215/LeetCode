fun main(args: Array<String>) {
    val test = intArrayOf(-10,-3,0,5,9)
    val head = ListNode(test[0])
    var operate = head

    for (i in 1 until test.size) {
        operate.next = ListNode(test[i])
        operate = operate.next!!
    }

    val solution = Solution()
    solution.sortedListToBST(head)
}