import java.util.List;

public class Tree {

//    private int numberOfGenerations = (int) (Math.random() * 5);
//
//
//    //tree with random number of child and generations
//    public Branch makeTree() {
//        Branch tree;
//
//        int numberOfChild = (int) (Math.random() * 5);
//
//        if (numberOfGenerations == 0) {
//            tree = new Branch();
//
//        } else {
//            tree = new Branch();
//            for (int i = 0; i < numberOfChild; i++) {
//                tree.getBranches().add(new Tree().makeTree());
//            }
//        }
//        return tree;
//    }


    //tree with predefined number of Generations
    public Branch makeTree(int numberOfGenerations) {

        Branch tree;
        int numberOfChild = (int) (Math.random() * 3) + 1;

        if (numberOfGenerations == 0) {
            tree = new Branch();
        } else {
            tree = new Branch();
            for (int i = 0; i < numberOfChild; i++) {
                tree.getBranches().add(new Tree().makeTree(numberOfGenerations - 1));
            }
        }
        return tree;
    }


    // Deepest level of the tree = number of generations + 1
    public int findDeepestLevel(Branch tree) {
        int level = 0;
        if (tree == null ) {
            return 0;
        }
        if (tree.getBranches() == null) {
            return 1;
        }
        for (int i = 0; i < tree.getBranches().size(); i++) {
            level = Math.max(level, findDeepestLevel(tree.getBranches().get(i)));
        }
        return level + 1;

    }



}
