import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        val ca = s.toCharArray()

        val stack = Stack<Char>()

        for (char in ca) {
            when (char) {
                '{' -> stack.push(char)
                '[' -> stack.push(char)
                '(' -> stack.push(char)

                '}' -> {
                    if (stack.empty() || stack.pop() != '{') return false
                }

                ']' -> {
                    if (stack.empty() || stack.pop() != '[') return false
                }

                ')' -> {
                    if (stack.empty() || stack.pop() != '(') return false
                }
            }
        }

        return stack.empty()
    }
}