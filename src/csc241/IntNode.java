package csc241;

public class IntNode {
    // Instance variables
    int value;
    IntNode left,right;

    // Constructor
    public IntNode(int value){
        this.value = value;
        this.left = this.right = null;
    }

    // insert - insert value in appropriate subtree
    public void insert(int v){
        // Determine subtree
        if (v <= value){
            // belongs in left
            if (left == null) {
                // Create a new left child
                left = new IntNode(v);
            } else {
                left.insert(v);
            }
        } else {
            // belongs on the right
            if (right == null) {
                // Create a new left child
                right = new IntNode(v);
            } else {
                right.insert(v);
            }
        }
    }

    // contains - finds a value
    public boolean contains(int v){
        // Check for value
        if (v == value) {
            return true;
        } else if (v < value) {
            // Could be on the left
            if (left == null) {
                // No left child
                return false;
            } else {
                return left.contains(v);
            }
        } else {
            // might on the right
            if (right == null) {
                // No right child
                return false;
            } else {
                return right.contains(v);
            }
        }
    }
}
