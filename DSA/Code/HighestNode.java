public class Main(){
    int data; 
    TreeNode left , right ;
    TreeNode( int val){
        date = val ; 
        left = right = null ;

    }
}
public static int findMax(TreeNode root){
    if(root == null) return Integer.MIN_VALUE ;
    int leftMax = findMax(root.left) ;
    int rightMax = findMax(root.right) ;
    return Math.max(root.data, Math.max(leftMax , rightMax)); 
}