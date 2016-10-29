package medium;
/**
 * Given a binary tree, flatten it to a linked list in-place. 
For example,
Given 
         1
        / \
       2   5
      / \   \
     3   4   6

The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
 * @author Shiyun Huang
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class FlattenBinaryTreeToLinkedList114 {
    public void flatten(TreeNode root) {
        /*
         * Find the last branch on the left.
         */
        TreeNode leftBranch = root;
        while(leftBranch!=null){
            if(leftBranch.left.left!=null&&leftBranch.left.right!=null){
                leftBranch = leftBranch.left;
            }
            else if(leftBranch.left.left==null&&leftBranch.left.right!=null){
                leftBranch.left = leftBranch.right;
            }
            else if(leftBranch.left.left==null&&leftBranch.left.right==null){
                return;
            }
            else break;
        }
        /*
         * Find the left most node.
         */
        TreeNode leftMost = leftBranch.left;
        while(leftMost.left!=null){
            leftMost = leftMost.left;
        }
        /*
         * Move all the elements from the right branch to the left.
         */
        if(leftBranch.right!=null){
            leftMost.left = leftBranch.right;
        }
        /*if(root.right!=null){
            flatten(root);
        }*/
        
    }
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = n1.left = new TreeNode(2);
        TreeNode n3 = n2.left = new TreeNode(3);
        TreeNode n4 = n3.left = new TreeNode(4);
        TreeNode n5 = n2.right = new TreeNode(5);
        TreeNode n6 = n1.right = new TreeNode(6);
        new FlattenBinaryTreeToLinkedList114().flatten(n1);
        System.out.println(n3.right.val);
    }

}
