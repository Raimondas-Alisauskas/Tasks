import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Tree t = new Tree();

        int numberOfGenerations = 5;

        Branch tree = t.makeTree(numberOfGenerations);

        int deepestLevel = t.findDeepestLevel(tree);

        System.out.println("Number of generations is " + numberOfGenerations);
        System.out.println("Deepest level is 1 + " + numberOfGenerations + " = " +  deepestLevel);
        System.out.println("Please check tests also");// TODO


//        Branch tree1 = t.makeTree();
//
//        int deepestLevel1 = t.findDeepestLevel(tree1);
//
//        System.out.println();
//        System.out.println("Deepest level of randomly generated tree is " +  deepestLevel1);


    }
}
