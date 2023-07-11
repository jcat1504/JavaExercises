List<List<Integer>> res = new ArrayList<>();  
if (root == null) return res;  
Queue<TreeNode> queue = new LinkedList<>();  
queue.add(root);  
while (!queue.isEmpty()) {  
　　List<Integer> level = new ArrayList<>();  
　　int cnt = queue.size();  
　　for (int i = 0; i < cnt; i++) {  
　　　　TreeNode node = queue.poll();  
　　　　level.add(node.val);  
　　　　if (node.left != null) {  
　　　　　　queue.add(node.left);  
　　　　}
　　　　if (node.right != null) {  
　　　　　　queue.add(node.right);  
　　　　}  
　　}  
　　res.add(level);   
}  
return res;