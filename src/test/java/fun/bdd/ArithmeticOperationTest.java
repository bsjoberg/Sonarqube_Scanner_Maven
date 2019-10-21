package fun.bdd;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticOperationTest {
    @Test
    public void addTwoNumbers() {
        ArithmeticOperation operation = new ArithmeticOperation();
        Assert.assertEquals(20, operation.add(8, 12));
    }
}
