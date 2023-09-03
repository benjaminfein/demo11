public class Node {
    private int value;
    private Node rightChild;
    private Node leftChild;

    Node(int value) {
        this.value = value;
        rightChild = null;
        leftChild = null;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(final Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(final Node leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", rightChild=" + rightChild +
                ", leftChild=" + leftChild +
                '}';
    }
}
