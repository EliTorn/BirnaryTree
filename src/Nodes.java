public class Nodes {
    private int data;

    @Override
    public String toString() {
        return "Nodes{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    private Nodes left;
    private Nodes right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodes getLeft() {
        return left;
    }

    public void setLeft(Nodes left) {
        this.left = left;
    }

    public Nodes getRight() {
        return right;
    }

    public void setRight(Nodes right) {
        this.right = right;
    }

    public Nodes(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
