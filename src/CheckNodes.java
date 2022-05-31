import java.util.LinkedList;
import java.util.Queue;

public class CheckNodes {
    public static void main(String[] args) {
        Nodes n = new Nodes(3);
        Nodes n1 = new Nodes(7);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(1);
        Nodes n4 = new Nodes(8);
        Nodes n5 = new Nodes(6);
        n.setLeft(n1);
        n1.setRight(n2);
        n.setRight(n3);
        n3.setLeft(n4);
        n3.setRight(n5);
        int number =NumberOfLeaves(n);
        System.out.println(number);
        System.out.println("+++++++++++++++++++++");
        levelScan(n);


    }

    public static void InOrder(Nodes n){
        if(n == null){
            return;
        }
        InOrder(n.getLeft());
        System.out.println(n.getData()+"->");
        InOrder(n.getRight());
    }
    // It's check what the number of leaves...
    public static int NumberOfLeaves(Nodes t){
        if(t.getLeft() == null && t.getRight() == null){
            return 1;
        }
        else if(t.getRight() == null){
            return NumberOfLeaves(t.getLeft());
        }
        else if(t.getLeft() == null){
            return NumberOfLeaves(t.getRight());
        }
        return NumberOfLeaves(t.getRight())+NumberOfLeaves(t.getLeft());
    }
    public static void levelScan(Nodes t){
        Queue <Integer> queue = new LinkedList<>();
        queue.add(t.getData());
        while(! queue.isEmpty() && t !=  Queue <Integer> queue = new LinkedList<>();
        queue.null){
            int keep = queue.poll();
            System.out.println(keep);
            if(t.getLeft() != null){
                queue.add(t.getLeft().getData());
                levelScan(t.getLeft());

            }
            else if(t.getRight() != null){
                queue.add(t.getRight().getData());
                levelScan(t.getRight());
            }
        }

    }





}
