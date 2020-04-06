package csc241;

public class Main {

    public static void main(String[] args) {

        IntBst tree1 = new IntBst();

        tree1.insert(20);
        tree1.insert(10);
        tree1.insert(30);

        System.out.println("CONTAINS 30: " + tree1.contains(30));
        System.out.println("CONTAINS 15: " + tree1.contains(15));

    }
}
