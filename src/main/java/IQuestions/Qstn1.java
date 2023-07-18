package IQuestions;

import java.util.HashMap;
import java.util.Map;

public class Qstn1 {
    private Map<Integer, Integer> verticalSum; // Stores the vertical sums of nodes

    public Qstn1() {
        verticalSum = new HashMap<>();
    }

    public void findVerticalSum(TreeNode root) {
        calculateVerticalSum(root, 0); // Start with vertical index 0
    }

    private void calculateVerticalSum(TreeNode node, int verticalIndex) {
        if (node == null) {
            return;
        }

        // Recursively calculate the vertical sum for the left and right subtrees
        calculateVerticalSum(node.left, verticalIndex - 1);
        calculateVerticalSum(node.right, verticalIndex + 1);

        // Update the vertical sum for the current vertical index
        int sum = verticalSum.getOrDefault(verticalIndex, 0);
        sum += node.val;
        verticalSum.put(verticalIndex, sum);
    }

    public Map<Integer, Integer> getVerticalSum() {
        return verticalSum;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Create an instance of Qstn1
        Qstn1 qstn1 = new Qstn1();

        // Find the vertical sum
        qstn1.findVerticalSum(root);

        // Get the vertical sums
        Map<Integer, Integer> verticalSum = qstn1.getVerticalSum();

        // Print the vertical sums
        for (Map.Entry<Integer, Integer> entry : verticalSum.entrySet()) {
            int verticalIndex = entry.getKey();
            int sum = entry.getValue();
            System.out.println("Vertical Index: " + verticalIndex + ", Sum: " + sum);
        }
    }
}
