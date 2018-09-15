import org.junit.Assert;
import org.junit.Test;

public class HeightCalculatorTest {

    @Test
    public void findTreeHeight() {

        ManualPopulatorForTests populator = new ManualPopulatorForTests();
        HeightCalculator calculator = new HeightCalculator();

        Branch tree = populator.getTree();

        Assert.assertEquals(4, calculator.findTreeHeight(tree));

    }
}