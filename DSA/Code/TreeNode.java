public class Main {
    int data ; 
    TreeNode left, right; 

    TreeNode(int val ){
         data = val ; 
         left = right = null ; 
    }
}
public static int countLeaves(TreeNode root) {
    if(root == null ) return 0 ;
    if (root.left == null && root.right == null) {
        return 1; 
    }return countLeaves(root.left) + countLeaves(root.right); 

}