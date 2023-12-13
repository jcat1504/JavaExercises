public boolean isBalanced(TreeNode root) {
    return checkBalanced(root) != -1;
}

private int checkBalanced(TreeNode root) {
    if (root == null) return 0;

    int leftHeight = checkBalanced(root.left);
    if (leftHeight == -1) return -1;

    int rightHeight = checkBalanced(root.right);
    if (rightHeight == -1) return -1;

    int balanceFactor = Math.abs(leftHeight - rightHeight);
    if (balanceFactor > 1) return -1;

    return Math.max(leftHeight, rightHeight) + 1;
}
