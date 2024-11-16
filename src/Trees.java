public class Trees {

    private static class node {

        int value;
        node left, right;

        public node(int item) {
            value = item;
            left = right = null;
        }
    }

    node root;

    Trees() {
        root = null;
    }

    void postorder(node nodes) {
        if (nodes != null) {

            postorder(nodes.left);
            postorder(nodes.right);
            System.out.print(nodes.value + " ");

        }
    }

    public static void main(String[] args) {
        Trees puno = new Trees();
        
        //root
        puno.root = new node(50);


        //left
        puno.root.left = new node(45);
        puno.root.left.left = new node(39);
        puno.root.left.right = new node(212);
        puno.root.left.right.left = new node(3);
        puno.root.left.right.left.left = new node(1);
        puno.root.left.right.left.right = new node(1001);
        puno.root.left.right.right = new node(411);
        puno.root.left.left.right = new node(91);
        puno.root.left.left.left = new node(21);
        puno.root.left.left.left.right = new node(31);
        puno.root.left.left.left.right.left = new node(12);
             
        puno.root.left.left.left.right.right = new node(93);
        puno.root.left.left.left.left = new node(19);
        puno.root.left.left.left.left.left = new node(10);
        puno.root.left.left.left.left.right = new node(201);

        //right
        puno.root.right = new node(54);
        puno.root.right.left = new node(41);
        puno.root.right.right = new node(120);
        puno.root.right.right.left = new node(13);
        puno.root.right.right.left.left = new node(43);
        puno.root.right.right.left.right = new node(17);
        puno.root.right.right.left.left.left = new node(19);
        puno.root.right.right.left.left.right = new node(501);
        puno.root.right.right.right = new node(512);
        puno.root.right.right.right.left = new node(311);
        puno.root.right.right.right.left.left = new node(14);
        puno.root.right.right.right.left.right = new node(2000);
        puno.root.right.right.right.left.left.left = new node(5);
        puno.root.right.right.right.left.left.right = new node(30);
        puno.root.right.right.right.right = new node(1000);
        puno.root.right.right.right.right.left = new node(8);
        puno.root.right.right.right.right.left = new node(9000);

        puno.postorder(puno.root);
        System.out.print( " ");
    }

}
