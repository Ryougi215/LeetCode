fun main(args: Array<String>) {
    val test = Array(2) { IntArray(3) }
//    test[0] = intArrayOf(1, 1, 1)
//    test[1] = intArrayOf(1, 1, 0)
//    test[2] = intArrayOf(1, 0, 1)
    test[0] = intArrayOf(0, 0, 0)
    test[1] = intArrayOf(1, 0, 0)

    val solution = Solution()
    solution.floodFill(test, 1, 0, 2)
    print(test)
}