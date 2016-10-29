package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DFS
 * @author Shiyun Huang
 *
 */
public class BinaryTreeLevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList <List<Integer>>();
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();//key-level, value-List of nodes in that level
        dfs(root, 0, map);
        for (int i = 0; i < map.size(); i++) {
            res.add(map.get(i));
        }
        return res;
    }
    private void dfs (TreeNode node, int levelNum, HashMap<Integer, List<Integer>> map) {
        if (node == null) return;
        if(!map.containsKey(levelNum)) {
            List<Integer> level = new ArrayList<Integer>();
            level.add(node.val);
            map.put(levelNum, level);
        }
        else {
            map.get(levelNum).add(node.val);
        }
        dfs(node.left, levelNum + 1, map);
        dfs(node.right, levelNum + 1, map);
    }
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = n1.left = new TreeNode(9);
        TreeNode n3 = n1.right = new TreeNode(20);
        TreeNode n4 = n3.left = new TreeNode(15);
        TreeNode n5 = n3.right = new TreeNode(7);
        BinaryTreeLevelOrderTraversal102 x = new BinaryTreeLevelOrderTraversal102();
        List<List<Integer>> list = x.levelOrder(n1);
        System.out.println(list);
    }

}
