package csc241;

public class IntBst {
    // Instance Variables
    IntNode root;

    // Constructor
    public IntBst(){
        // Create an empty tree
        this.root = null;
    }

    // insert - insert a new value
    public void insert(int v){
        if (root == null){
            // First node
            root = new IntNode(v);
        } else {
            root.insert(v);
        }
    }

    // Contains -- look for a value
    public boolean contains(int v){
        if (root == null) {
            return false;
        } else {
            return root.contains(v);
        }
    }

}
