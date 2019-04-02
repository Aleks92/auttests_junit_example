import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorSubTest {

    @Parameterized.Parameter
    public int a;
    @Parameterized.Parameter(1)
    public int b;
    @Parameterized.Parameter(2)
    public int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[]{6, 2, 4},
                new Object[]{10, 1, 9}
        );
    }

    @Test
    public void calculatorSubshouldSubTwoNumbers() {
        Calculator calculator = new Calculator();
        int actual = calculator.sub(a, b);
        assertEquals(expected, actual);


    }

}
