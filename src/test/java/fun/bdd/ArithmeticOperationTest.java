package fun.bdd;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticOperationTest {
    @Test
    public void addTwoNumbers() {
        ArithmeticOperation operation = new ArithmeticOperation();
        Assert.assertEquals(20, operation.add(8, 12));
        Assert.assertEquals(24, operation.add(11,13));
    }

    @Test
    public void subtractTwoNumbers() {
        ArithmeticOperation operation = new ArithmeticOperation();
        Assert.assertEquals(8, operation.subtract(12, 4));
    }
}
