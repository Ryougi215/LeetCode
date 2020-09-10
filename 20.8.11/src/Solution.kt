class Solution {
    fun solve(board: Array<CharArray>): Unit {
        val m: Int = board.size

        if (m == 0) {
            return
        }

        val n: Int = board[0].size

        for (i in 0 until n step 1) {
            dfs(0, i, board)
            dfs(m - 1, i, board)
        }

        for (i in 1 until m - 1 step 1) {
            dfs(i, 0, board)
            dfs(i, n - 1, board)
        }

        for ((i, rows) in board.withIndex()) {
            for ((j, item) in rows.withIndex()) {
                if (item == 'T') {
                    board[i][j] = 'O'
                } else if (item == 'O') {
                    board[i][j] = 'X'
                }
            }
        }
    }

    private fun dfs(x: Int, y: Int, board: Array<CharArray>) {
        if (x < 0 || y < 0 || y >= board[0].size || x >= board.size || board[x][y] != 'O') {
            return
        }

        board[x][y] = 'T'

        dfs(x - 1, y, board)
        dfs(x + 1, y, board)
        dfs(x, y - 1, board)
        dfs(x, y + 1, board)
    }
}