public class Tree {
    private Node rootNode;

    public Tree() {
        rootNode = null;
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeftChild(addRecursive(current.getLeftChild(), value));
        } else if (value > current.getValue()) {
            current.setRightChild(addRecursive(current.getRightChild(), value));
        } else {
            return current;
        }

        return current;
    }
}
