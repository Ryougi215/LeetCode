class Solution {
    private val visited: HashMap<Node, Node> = HashMap()

    fun cloneGraph(node: Node?): Node? {
        if (node == null) {
            return null
        }

        if (visited.containsKey(node)) {
            return visited[node]
        }

        val newNode: Node = Node(node.`val`)
        visited[node] = newNode

        for (neighbor in node.neighbors) {
            newNode.neighbors.add(cloneGraph(neighbor))
        }

        return newNode
    }
}