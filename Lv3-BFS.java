public static Main {
	public static void main(String[] args) {
		Graph graph = new Graph(5);

		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();
		
		graph.depthFirstSearch(0);
	}
}

import java.util.*;
public class Graph {
	ArrayList<Node> nodes;
	int[][] matrix;
	
	Graph(int size) {
		nodes = new ArrayList<>();
		matrix = new int[size][size];
		}
	public void addNode(Node node) {
		nodes.add(node);
		}
	public void addEdge(int src, int dst) {
		matrix[src][dst] = 1;
	}
	public boolean checkEdge(int src, int dst) {
		if(matrix[src][dst] == 1) {
			return true;
		} else {
			return false;
		}
	}

public void print(); {
	for(Node node : nodes) {
		System.out.print(node.data + " ");
		}
	System.out.println();
	for(int i = 0; i < matrix.length; i++) {
		for(int j = 0; j < matrix[i].length; j++) {
			System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	
public void breadthFirstSearch(int src) {
		
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[matrix.length];
		
		queue.offer(src);
		visited[src] = true;
		
		while(queue.size() != 0) {
			
			src = queue.poll();
			System.out.println(nodes.get(src).data + " = visited");
			
			for(int i = 0; i < matrix[src].length; i++) {
				if(matrix[src][i] == 1 && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
		}
public class Node {
	char data;
	Node(char data) {
		this.data = data;
		}
}