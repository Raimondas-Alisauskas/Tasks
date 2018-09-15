public class RunApp {

    public static void main(String[] args) {

        TreePopulator populator = new TreePopulator();
        TreeCalculator calculator = new TreeCalculator();

        //Tree with predefined number of branch's generations
        int numberOfGenerations = 5;
        Branch tree = populator.createTree(numberOfGenerations);


        //Calculation of the tree height
        int treeHeight = calculator.findTreeHeight(tree);

        System.out.println("Number of generations is " + numberOfGenerations);
        System.out.println("The height of the tree is 1 + " + numberOfGenerations + " = " +  treeHeight);
        System.out.println("Please check tests also");


        //Tree with random number of branches and generations
        Branch tree1 = populator.createTree();

        //Calculation of the tree height
        int treeHeight1 = calculator.findTreeHeight(tree1);

        System.out.println();
        System.out.println("The height of the randomly generated tree is " +  treeHeight1);

    }
}
