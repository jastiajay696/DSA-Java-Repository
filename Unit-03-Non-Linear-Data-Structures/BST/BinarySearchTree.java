public class BinarySearchTree {
    static class Node {
        int key; Node left, right;
        Node(int key) { this.key = key; }
    }
    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.key) root.left = insert(root.left, key);
        else if (key > root.key) root.right = insert(root.right, key);
        return root;
    }
    static boolean contains(Node root, int key) {
        while (root != null) {
            if (key == root.key) return true;
            root = key < root.key ? root.left : root.right;
        }
        return false;
    }
    public static void main(String[] args) {
        Node root = null;
        for (int x : new int[]{50, 30, 70, 20, 40, 60, 80}) root = insert(root, x);
        System.out.println("Contains 60: " + contains(root, 60));
    }
}
