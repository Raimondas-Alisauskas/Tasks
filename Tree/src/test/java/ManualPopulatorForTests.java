class ManualPopulatorForTests {

    private Branch tree = new Branch();

    /**
     * @return 3 generations, tree height = 4.
     */
    Branch getTree() {

        tree.getBranches().add(new Branch());
        tree.getBranches().add(new Branch());
        tree.getBranches().add(new Branch());
        tree.getBranches().get(0).getBranches().add(new Branch());
        tree.getBranches().get(1).getBranches().add(new Branch());
        tree.getBranches().get(1).getBranches().add(new Branch());
        tree.getBranches().get(2).getBranches().add(new Branch());
        tree.getBranches().get(2).getBranches().get(0).getBranches().add(new Branch());

        return tree;
    }
}
