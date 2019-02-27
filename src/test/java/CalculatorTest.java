import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private static final double DELTA = 0.0001d;



    public void add() {

        Calculator calculator = new Calculator();

        assertEquals(6.0d, calculator.add(2, 4), DELTA);

    }



    public void subtract() {

        Calculator calculator = new Calculator();

        assertEquals(-2.0d, calculator.subtract(2, 4), DELTA);
    }

    public void multiply(){
        Calculator calculator = new Calculator();
        assertEquals(8.0d, calculator.multiply(2,4), DELTA);
    }

    public void divide(){
        Calculator calculator = new Calculator();
        assertEquals(0.5d, calculator.divide(2,4),DELTA);
    }
}
