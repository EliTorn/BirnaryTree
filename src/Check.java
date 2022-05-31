import java.net.Inet4Address;

public class Check {
    public static void main(String[] args) {
        BinaryTree<Integer> b = new BinaryTree<>(3);
        BinaryTree<Integer> b1 = new BinaryTree<>(7);
        BinaryTree<Integer> b2 = new BinaryTree<>(1);
        BinaryTree<Integer> b3 = new BinaryTree<>(2);
        BinaryTree<Integer> b4 = new BinaryTree<>(8);
        BinaryTree<Integer> b5 = new BinaryTree<>(6);
        BinaryTree<Integer> b6 = new BinaryTree<>(8);
        BinaryTree<Integer> b7 = new BinaryTree<>(9);
        b.setRight(b1);
        b.setLeft(b2);
        b1.setRight(b3);
        b2.setRight(b4);
        b2.setLeft(b5);
        System.out.println(b);
        b.postOrder(b);
        System.out.println();
        b.inOrder(b);
        System.out.println();
        b.preOrder(b);
        System.out.println();
        number(b);
        System.out.println(number(b));
        System.out.println("+++++++++++++++++++++++++");
        printT(b);
    }

    public static int number(BinaryTree<Integer> b) {
        if (b == null) {
            return 0;
        }
        return 1 + number(b.getLeft()) + number(b.getRight());
    }

    public static void printT(BinaryTree<Integer> b) {
        if (b == null) {
            return;
        }
        System.out.println(b.getData());

        printT(b.getLeft());
        printT(b.getRight());
    }


}
