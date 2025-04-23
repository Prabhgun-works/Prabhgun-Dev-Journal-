// Define the TreeNode class properly
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int val) {
        data = val;
        left = right = null;
    }
}

// Define the Main class with a search method
public class Main {

    public boolean search(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (root.data == k) {
            return true;
        }
        return search(root.left, k) || search(root.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);

        Main m = new Main();
        System.out.println(m.search(root, 40)); 
        System.out.println(m.search(root, 99)); 
    }
}