public class BinaryTree <T> {
    private T data;
    private BinaryTree<T> left;
    private BinaryTree <T> right;

    public BinaryTree(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return(int) data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTree<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTree<T> left) {
        this.left = left;
    }

    public BinaryTree<T> getRight() {
        return right;
    }

    public void setRight(BinaryTree<T> right) {
        this.right = right;
    }

    public BinaryTree(T data, BinaryTree<T> left, BinaryTree<T> right) {
        this.data = data;
        this.right = right;
        this.left = left;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public void preOrder(BinaryTree<T> node) {
        if (node == null)
            return;
        // traverse the root node
        System.out.print(node.data + "->");
        // traverse the left child
        preOrder(node.left);
        // traverse the right child
        preOrder(node.right);
    }

    public void inOrder(BinaryTree<T> node) {
        if (node == null)
            return;
        inOrder(node.getLeft());
        System.out.print(node.getData()+"->");
        inOrder(node.getRight());
    }
    public void postOrder(BinaryTree<T> node){
        if (node == null)
            return;
       postOrder(node.left);
       preOrder(node.right);
        System.out.print(node.data+"->");
    }

}
