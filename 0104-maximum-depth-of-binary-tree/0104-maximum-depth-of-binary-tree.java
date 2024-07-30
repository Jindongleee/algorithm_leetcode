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
public class Solution {
    // 최대 깊이를 계산하는 함수
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            // 왼쪽과 오른쪽 서브트리의 깊이를 재귀적으로 계산
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            
            // 더 큰 깊이에 1을 더하여 반환
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}