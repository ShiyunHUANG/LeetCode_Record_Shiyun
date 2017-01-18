package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        q1.add(root);
        while(q1.size() > 0 || q2.size() > 0) {
            while(q1.size() > 0) {
                TreeNode head = q1.remove();
                if(q1.size() == 0) res.add(head.val);
                if(head.left != null) q2.add(head.left);
                if(head.right != null) q2.add(head.right);
            }
            while(q2.size() > 0) {
                TreeNode head = q2.remove();
                if(q2.size() == 0) res.add(head.val);
                if(head.left != null) q1.add(head.left);
                if(head.right != null) q1.add(head.right);
            }
        }
        return res;
    }
}
