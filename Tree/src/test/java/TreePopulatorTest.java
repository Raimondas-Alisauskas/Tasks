import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreePopulatorTest {

    @Test
    public void createTree() {

        TreePopulator populator = new TreePopulator();
        TreeCalculator calculator = new TreeCalculator();

        Branch tree = populator.createTree(6);

        Assert.assertEquals("Tree height = 1 + number of generations",7, calculator.findTreeHeight(tree));

    }
}