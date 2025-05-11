/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            int n=Q.size();
            ArrayList<Integer> subList=new ArrayList<>();
            for(int index=0;index<n;index++){
                TreeNode curNode=Q.poll();
                subList.add(curNode.val);


                if(curNode.left!=null){
                    Q.add(curNode.left);
                }
                if (curNode.right != null) {
                    Q.add(curNode.right);
                }
            }
            result.add(subList);
        }
        return result;
    }
}