public class Tree {

    public static void main(String[] args) {


//        int numberOfGenerations = (int) (Math.random() * 3);

//        Branch tree = new Tree().makeTree(numberOfGenerations);

        Branch tree = new Tree().makeTree();


    }

    private Branch tree;
    private int numberOfGenerations = (int) (Math.random() * 3);

    private Branch makeTree(){

        int numberOfChild = (int) (Math.random() * 3);

        if (numberOfGenerations == 0) {
            tree = new Branch();
        }
        else {
            tree = new Branch();
            for (int i = 0; i <numberOfChild ; i++) {
                numberOfGenerations--;
                tree.getBranches().add(new Tree().makeTree());
            }
        }
        return tree;
    }


    private Branch makeTree(int numberOfGenerations){

        int numberOfChild = (int) (Math.random() * 3);

        if (numberOfGenerations == 0) {
            tree = new Branch();
        }
        else {
            tree = new Branch();
            for (int i = 0; i <numberOfChild ; i++) {
                tree.getBranches().add(new Tree().makeTree(numberOfGenerations - 1));
            }
        }
        return tree;
    }

}
