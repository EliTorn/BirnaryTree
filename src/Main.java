import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> b3 = new BinaryTree<>(9);
        BinaryTree<Integer> b2 = new BinaryTree<>(7);
        BinaryTree<Integer> b1 = new BinaryTree<>(2,b2,b3);
        BinaryTree<Integer> b4 = new BinaryTree<>(8);

        b2.setRight(b4);
        System.out.println(b1);
        LinkedList <Integer> list = new LinkedList<>();

        System.out.println("------------per Order-----------------");
        b1.preOrder(b1);
        System.out.println();
        System.out.println("------------in order-------------------");
        b1.inOrder(b1);
        System.out.println();
        System.out.println("------------post order ----------------");
        b1.postOrder(b1);
        System.out.println("===========================");
        int num = sumOfTree(b1);
        System.out.println(num);
        System.out.println("------------number of the a nodes -------------");


        System.out.println("--------------------------");
        BinaryTree<String> s1 = new BinaryTree<>("Eliyahu");
        BinaryTree<String> s2 = new BinaryTree<>("ssds");
        BinaryTree<String> s3 = new BinaryTree<>("DED");
        BinaryTree<String> s4 = new BinaryTree<>("ddd");
        s1.setRight(s2);
        s1.setLeft(s3);
        s3.setRight(s4);



    }

    public static int sumOfTree(BinaryTree <Integer> T){
        if(T  == null){
            return 0;
        }
        return 1 + sumOfTree(T.getRight())+ sumOfTree(T.getLeft());
    }
    public static void M(){

    }


}
