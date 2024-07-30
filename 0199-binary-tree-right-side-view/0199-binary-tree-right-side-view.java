import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;

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

    // public List<Integer> rightSideView(TreeNode root) {
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     List<Integer> answer = new ArrayList<>();
        
    //     if(root==null)
    //         return answer;

    //     queue.add(root);

    //     while(!queue.isEmpty()){
    //         TreeNode node = queue.poll();
            
    //         answer.add(node.val);
            
    //         if(node.right!=null){
    //             queue.add(node.right);
    //         }
    //         else{
    //             break;
    //         }

    //     }
    //     return answer;
    // }


    // public List<Integer> rightSideView(TreeNode root) {
    //     Stack<TreeNode> queue = new Stack<>();
    //     List<Integer> answer = new ArrayList<>();
        
    //     if (root == null) {
    //         return answer;
    //     }

    //     queue.add(root);

    //     while (!queue.isEmpty()) {
    //         int queueLength = queue.size();

    //         for(int i=1;i<=queueLength;i++){
    //         //동일 노드를 전부 
    //             TreeNode node = queue.pop();
    //             // 레벨의 마지막 노드일 경우 answer 리스트에 추가
    //             if(i==1)
    //                 answer.add(node.val);
    //             // 오른쪽 자식 노드만 큐에 추가
    //             if (node.right != null) {
    //                 queue.push(node.right);
    //             }
    //         }
    //     }
    //     return answer;
    // }
    
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        
        if (root == null) {
            return answer;
        }

        queue.add(root);

        while (!queue.isEmpty()) {
            int queueLength = queue.size();

            //동일 노드를 전부 
            for (int i = 1; i <= queueLength; i++) {
                TreeNode node = queue.poll();
                
                // 레벨의 마지막 노드일 경우 answer 리스트에 추가
                if (i == queueLength) {
                    answer.add(node.val);
                }
                
                // 오른쪽 자식 노드만 큐에 추가
                if(node.left != null){
                    //예외처리가 가능
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return answer;
    }
}