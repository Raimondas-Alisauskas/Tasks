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






}
