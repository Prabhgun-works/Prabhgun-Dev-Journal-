public class Main{
    int data ; 
    TreeNode(right , left); 
    TreeNode(int val){
        val = data ;
        rigth = left = null ; 
    }
} public class InsertNewNode(TreeNode root , int val){
    if(root == null) return null ; 
    Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();

            if (temp.left == null) {
                temp.left = new TreeNode(val);
                return;
            } 
            else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new TreeNode(val);
                return;
            } else {
                q.add(temp.right);
            }
        }
    }
public static void printLevelOrder(TreeNode root) {
    if (root == null) return;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        TreeNode current = queue.poll();
        System.out.print(current.data + " ");

        if (current.left != null)
            queue.add(current.left);

        if (current.right != null)
            queue.add(current.right);
    }
}
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        insertNewNode(root, 60); 
        printLevelOrder(root);
    
    }
