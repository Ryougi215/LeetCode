import java.io.CharArrayReader

fun main(args: Array<String>) {
    val test:Array<CharArray> = Array(4){CharArray(6)}
    test[0] = charArrayOf('X','O','X','O','X','O')
    test[1] = charArrayOf('O','X','O','X','O','X')
    test[2] = charArrayOf('X','O','X','O','X','O')
    test[3] = charArrayOf('O','X','O','X','O','X')


    val solution = Solution()

    solution.solve(test)

    print(test[0][0])
}