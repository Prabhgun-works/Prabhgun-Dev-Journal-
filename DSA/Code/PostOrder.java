public class TreeNode {
    int data ;
    TreeNode left , right ; 
    TreeNode( int value) {
        data = value ; 
        left = right = null ; 
    }
}
public static void PostOrder(TreeNode root) {
    if( root == null) return ; 
    
    PostOrder(root.right); 
    System.out.println(root.data +" "); 
    PostOrder(root.left); 
}