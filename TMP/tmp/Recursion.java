public class Recursion {

    public void populate(Node n, int height){
        if(height == 0){
            n = new Node();
        }else{
            n = new Node();
            for(int i = 0; i < n.nbChilds(); i++){
                populate(n.getChildAt(i), height - 1);
            }
        }
    }

    public class Node {

        private Node[] childs;



        public Node getChildAt(int i) {
            return childs[i];
        }

        public int nbChilds() {
            return childs.length;
        }

    }



  /*      *//**
         * Performs full tree traversal using recursion.
         *//*
        public void traverse( Node parentNode ) {
            // traverse all nodes that belong to the parent
            for(Node node=parentNode.getFirstChild(); node!=null; node=node.getNextSibling()
            ) {
                // print node information
                System.out.println( node.getNodeName()+"="+node.getNodeValue());
                // traverse children
                traverse(node);
            }
        }*/


/*    public int getTreeHeight(Node<Integer> root) {
        int height = 0;
        if (root == null ) {
            return height;
        }
        if (root.childern == null) {
            return 1;
        }
        for (Node<Integer> child : root.childern) {
            height = Math.max(height, getTreeHeight(child));
        }
        return height + 1;
    }*/



/*    if (node == null)
            return 0;
        else
    {
        return 1 + Math.max(findPath(node.left), findPath(node.right) );
    }*/


/*    public int calculateTreeHeight(BinaryNode root){
        if (root!= null) {
            if (root.getLeft() != null || root.getRight() != null) {
                return 1 +
                        max(calculateTreeHeight(root.left),
                                calculateTreeHeight(root.right));
            }
        }
        return 0;
    }*/


//    public int findDeepestLevel(Branch tree) {
//
//        int count = 0;
//        if (countLevel(tree, count)) {
//
//            return count;
//        }
//
//        return 0;
//    }
//
//
//    public boolean countLevel(Branch tree, int count) {
//
//        if (tree.getBranches().isEmpty()) {
//            return false;
//        }
//
//
//        for (int i = 0; i < tree.getBranches().size(); i++) {
//            if (countLevel(tree.getBranches().get(i), count)) {
//                count++;
//                return true;
//            }
//        }
//
//        return false;
//    }




}
