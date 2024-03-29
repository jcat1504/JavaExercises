import org.w3c.dom.Node;

class Solution {
    Node[] visited;
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        visited = new Node[101];
        return DFS(node);//calls dfs method
    }
    public Node DFS(Node node){
        if(visited[node.val] != null) return visited[node.val];
        visited[node.val] = new Node(node.val);
        for(Node n: node.neighbors) visited[node.val].neighbors.add(DFS(n));
        return visited[node.val];
    }
}  

//solution 2
class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> map = new HashMap<>();
        return clone(node, map);
    }

    private static Node clone(Node node, Map<Node, Node> map) {
        if(node == null) return null;
        if(map.containsKey(node)) return map.get(node);
        Node clone = new Node(node.val);
        map.put(node,clone);
        for(Node neighbor : node.neighbors) {
            clone.neighbors.add(clone(neighbor, map));
        }
        return clone;
    }
}
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public void dfs(Node node , Node copy , Node[] visited){
        visited[copy.val] = copy;// store the current node at it's val index which will tell us that this node is now visited
        
//         now traverse for the adjacent nodes of root node
        for(Node n : node.neighbors){
//             check whether that node is visited or not
//              if it is not visited, there must be null
            if(visited[n.val] == null){
//                 so now if it not visited, create a new node
                Node newNode = new Node(n.val);
//                 add this node as the neighbor of the prev copied node
                copy.neighbors.add(newNode);
//                 make dfs call for this unvisited node to discover whether it's adjacent nodes are explored or not
                dfs(n , newNode , visited);
            }else{
//                 if that node is already visited, retrieve that node from visited array and add it as the adjacent node of prev copied node
//                 THIS IS THE POINT WHY WE USED NODE[] INSTEAD OF BOOLEAN[] ARRAY
                copy.neighbors.add(visited[n.val]);
            }
        }
        
    }
    public Node cloneGraph(Node node) {
        if(node == null) return null; // if the actual node is empty there is nothing to copy, so return null
        Node copy = new Node(node.val); // create a new node , with same value as the root node(given node)
        Node[] visited = new Node[101]; // in this question we will create an array of Node(not boolean) why ? , because i have to add all the adjacent nodes of particular vertex, whether it's visited or not, so in the Node[] initially null is stored, if that node is visited, we will store the respective node at the index, and can retrieve that easily.
        Arrays.fill(visited , null); // initially store null at all places
        dfs(node , copy , visited); // make a dfs call for traversing all the vertices of the root node
        return copy; // in the end return the copy node
    }
}


public class Solution {
    private HashMap<Integer, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null)
            return null;

        if (visited.containsKey(node.val))
            return visited.get(node.val);

        Node clone = new Node(node.val);
        visited.put(clone.val, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }
}