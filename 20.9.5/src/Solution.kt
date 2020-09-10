import java.util.*

class Solution {
    fun getPermutation(n: Int, k: Int): String {
        var sum = k

        val factorial = IntArray(n)
        factorial[0] = 1
        for (i in 1 until n) {
            factorial[i] = factorial[i - 1] * i
        }

        --sum
        val ans = StringBuffer()
        val valid = IntArray(n + 1)
        Arrays.fill(valid, 1)
        for (i in 1 until n + 1) {
            var order: Int = sum / factorial[n - i] + 1
            for (j in 1 until n + 1) {
                order -= valid[j]
                if (order == 0) {
                    ans.append(j)
                    valid[j] = 0
                    break
                }
            }
            sum %= factorial[n - i]
        }
        return ans.toString()
    }
}