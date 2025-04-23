public class Main {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }
    static int sumOfNodes(TreeNode root){
        if(root==null)
            return 0;
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    } }