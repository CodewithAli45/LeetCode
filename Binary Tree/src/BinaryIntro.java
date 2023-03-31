public class BinaryIntro {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinrayTree {
        static int idx = -1;
        public Node binaryIntro(int nodes[]){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = binaryIntro(nodes);
            newNode.right = binaryIntro(nodes);

            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinrayTree tree = new BinrayTree();
        Node root = tree.binaryIntro(nodes);
        System.out.println(root.data);

    }
}
