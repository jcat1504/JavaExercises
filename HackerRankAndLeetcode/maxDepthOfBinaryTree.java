import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        // in case of empty tree
        if (root == null) {
            return 0;
        }

        int height = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            // we are at a new level
            height++; // so increment height
            int size = q.size();
            // get all the children nodes of current level
            while (size-- > 0){
                TreeNode temp = q.poll();
                // add the left child (if exists)
                if (temp.left != null) {    
                    q.add(temp.left);
                }
                // add the right child (if exists)
                if (temp.right != null) {   
                    q.add(temp.right);
                }
            }
        }

        return height;  // return height
    }
}