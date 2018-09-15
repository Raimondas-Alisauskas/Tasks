import org.junit.Assert;
import org.junit.Test;

public class TreeCalculatorTest {

    @Test
    public void findTreeHeight() {

        ManualPopulatorForTests populator = new ManualPopulatorForTests();
        TreeCalculator calculator = new TreeCalculator();

        Branch tree = populator.getTree();

        Assert.assertEquals(4, calculator.findTreeHeight(tree));

    }
}