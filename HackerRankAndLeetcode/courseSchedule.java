import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        int[] degree = new int[numCourses];
        Queue queue = new LinkedList();
        int count=0;
        
        for(int i=0;i<numCourses;i++)
            graph[i] = new ArrayList();
            
        for(int i=0; i<prerequisites.length;i++){
            degree[prerequisites[i][1]]++;
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        for(int i=0; i<degree.length;i++){
            if(degree[i] == 0){
                queue.add(i);
                count++;
            }
        }
        
        while(queue.size() != 0){
            int course = (int)queue.poll();
            for(int i=0; i<graph[course].size();i++){
                int pointer = (int)graph[course].get(i);
                degree[pointer]--;
                if(degree[pointer] == 0){
                    queue.add(pointer);
                    count++;
                }
            }
        }
        if(count == numCourses)
            return true;
        else    
            return false;
    }
}

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Create an array of ArrayLists to represent the directed graph
        ArrayList[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList();
            
        // Create an array to keep track of visited nodes
        boolean[] visited = new boolean[numCourses];
        
        // Build the directed graph using prerequisites
        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        // Traverse each course to check if it can be finished
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graph, visited, i))
                return false;
        }
        return true;
    }

    // Depth-first search to check if a course can be finished
    private boolean dfs(ArrayList[] graph, boolean[] visited, int course) {
        // If the course has been visited in the current path, it's not possible to finish
        if (visited[course])
            return false;
        else
            visited[course] = true; // Mark the course as visited

        // Traverse the prerequisites of the current course
        for (int i = 0; i < graph[course].size(); i++) {
            if (!dfs(graph, visited, (int) graph[course].get(i)))
                return false;
        }
        visited[course] = false; // Reset the visited status when backtracking
        return true;
    }
}
