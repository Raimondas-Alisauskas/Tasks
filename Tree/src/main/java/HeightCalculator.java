public class HeightCalculator {

    /** Finds tree height. Height = number of generations + 1
     */
    public int findTreeHeight(Branch tree) {

        int height = 0;

        if (tree == null ) {
            return 0;
        }

        if (tree.getBranches() == null) {
            return 1;
        }

        for (int i = 0; i < tree.getBranches().size(); i++) {
            height = Math.max(height, findTreeHeight(tree.getBranches().get(i)));
        }

        return height + 1;
    }
}
