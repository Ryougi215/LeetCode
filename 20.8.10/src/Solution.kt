class Solution {
    fun countBinarySubstrings(s: String): Int {
        val arr: CharArray = s.toCharArray()

        if (arr.size <= 1) {
            return 0
        }

        val const: Int = ('0').toInt() * 2

        var count = 0

        for (index in 0 until arr.size - 1 step 1) {
            var step = 0
            while (index - step >= 0 && index + 1 + step <= arr.size - 1) {
                if (step == 0) {
                    if (arr[index - step].toInt() + arr[index + 1 + step].toInt() == const + 1) {
                        count++
                        step++
                    } else {
                        break
                    }
                } else if (arr[index] == arr[index - step] && arr[index + 1] == arr[index + 1 + step]) {
                    count++
                    step++
                } else {
                    break
                }
            }
        }

        return count
    }
}