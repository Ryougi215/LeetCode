class Solution {
    fun multiply(num1: String, num2: String): String {
        val ca1 = num1.toCharArray()
        val ca2 = num2.toCharArray()

        val n1 = IntArray(ca1.size)
        val n2 = IntArray(ca2.size)

        for (index in ca1.indices step 1) {
            n1[index] = ca1[index].toInt() - '0'.toInt()
        }

        for (index in ca2.indices step 1) {
            n2[index] = ca2[index].toInt() - '0'.toInt()
        }

        // 首位为0表明输入为0
        if (n1[0] == 0 || n2[0] == 0) {
            return "0"
        }

        val num = IntArray(n1.size + n2.size)


        for (i in n1.indices) {
            for (j in n2.indices) {
                num[i + j] += n1[i] * n2[j]
            }
        }

        val length = num.size
        for (i in length - 1 downTo 1) {
            val present = num[i] + num[i-1] % 10
            num[i] = present % 10
            num[i - 1] = num[i - 1] / 10 + present / 10
        }

        val result:ArrayList<Char> = ArrayList<Char>()

        for (index in num.indices step 1) {
            result.add((num[index] + '0'.toInt()).toChar())
        }

        if (result[0] == '0')
            result.removeAt(0)

        return String(result.toCharArray())
    }
}