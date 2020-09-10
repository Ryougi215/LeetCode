class Solution {
    companion object {
        val result = ArrayList<List<Int>>()
    }

    fun combine(n: Int, k: Int): List<List<Int>> {
        val nums = ArrayList<Int>()
        for (i in 1 until n + 1) {
            nums.add(i)
        }
        getResult(nums, ArrayList<Int>(), k)

        return result
    }

    private fun getResult(num_left: List<Int>, process: List<Int>, num_need: Int) {
        if (num_need == 0) {
            result.add(process)
            return
        }

        for (i in 0 until num_left.size - num_need + 1) {
            val subArray: List<Int> = num_left.subList(i + 1, num_left.size)
            val temp = ArrayList<Int>(process)
            temp.add(num_left[i])
            getResult(subArray, temp, num_need - 1)
        }
    }
}