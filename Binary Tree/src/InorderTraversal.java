public class InorderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    static class BinrayTree {
        static int idx = -1;
        public Node binaryNode(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = binaryNode(nodes);
            newNode.right = binaryNode(nodes);

            return newNode;
        }
    }

    public static void inOrderTraveral(Node root){
        if(root == null){
            return;
        }

        inOrderTraveral(root.left);
        System.out.print(root.data + " ");
        inOrderTraveral(root.right);
    }
    public static void main(String[] args) {
        int nodes[] = {2,4,3,-1,-1,7,-1,-1,8,-1,10,-1,-1};

        BinrayTree tree = new BinrayTree();
        Node root = tree.binaryNode(nodes);
        System.out.println(root.data);

        inOrderTraveral(root);
    }
}
