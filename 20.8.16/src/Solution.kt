class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        if (image.isEmpty()) {
            return image
        }

        refill(image, sr, sc, image[sr][sc])

        for (i in image.indices) {
            for (j in image[0].indices) {
                if (image[i][j] == -1) {
                    image[i][j] = newColor
                }
            }
        }

        return image
    }

    private fun refill(image: Array<IntArray>, sr: Int, sc: Int, oldColor: Int) {
        if (sr < 0 || sc < 0 || sr >= image.size || sc >= image[0].size || image[sr][sc] != oldColor) return

        image[sr][sc] = -1

        refill(image, sr + 1, sc, oldColor)
        refill(image, sr - 1, sc, oldColor)
        refill(image, sr, sc + 1, oldColor)
        refill(image, sr, sc - 1, oldColor)

        return
    }
}