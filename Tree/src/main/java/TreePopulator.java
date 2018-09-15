import java.util.Random;

public class TreePopulator {


    /**Creates the tree with predefined number of generations and random number of branches (1...5).
     * @param numberOfGenerations have to be positive number.
    */
    public Branch createTree(int numberOfGenerations) {

        Branch tree;
        int numberOfBranches = (int) (Math.random() * 5) + 1;

        if (numberOfGenerations == 0) {
            tree = new Branch();

        } else {
            tree = new Branch();
            for (int i = 0; i < numberOfBranches; i++) {
                tree.getBranches().add(new TreePopulator().createTree(numberOfGenerations - 1));
            }
        }
        return tree;
    }


    /**Creates the tree with random number of generations and random number of branches (0...5).
     */
    public Branch createTree() {

        Branch tree;
        int numberOfChild = (int) (Math.random() * 5);

        if(Math.random() < 0.5) {
            tree = new Branch();

        } else {
            tree = new Branch();
            for (int i = 0; i < numberOfChild; i++) {
                tree.getBranches().add(new TreePopulator().createTree());
            }
        }
        return tree;
    }

}
