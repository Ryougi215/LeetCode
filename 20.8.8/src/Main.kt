fun main(args: Array<String>) {
    var root: TreeNode = TreeNode(1)
    root.left = TreeNode(3)

    val temp = root.left
    temp?.right = TreeNode(2)

    val solution = Solution()
    solution.recoverTree(root)
}
