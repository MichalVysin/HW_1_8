import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void expressionTest(){
        String enter1 = "18 - 10";
        String output1 = "8";

        Assertions.assertEquals(output1, calculator.expression(enter1));

        String enter2 = "10 / 0";
        String output2 = "Nelze delit nulou!";
        Assertions.assertEquals(output2, calculator.expression(enter2));

        String enter3 = "2.5 + 8";
        String output3 = "10.5";
        Assertions.assertEquals(output3, calculator.expression(enter3));

        String enter4 = "10.0 + 5.0";
        String output4 = "15";
        Assertions.assertEquals(output4, calculator.expression(enter4));


    }

    @Test
    public void splitTest(){
        String enter = "12 + 2";
        Double a = 12.0;
        Character operation = '+';
        Double b = 2.0;

        Assertions.assertEquals(a, calculator.split(enter).getA());
        Assertions.assertEquals(operation, calculator.split(enter).getOperation());
        Assertions.assertEquals(b, calculator.split(enter).getB());
    }

    @Test
    public void operationTest(){
        String enter1 = "5 + 7";
        Double output1 = 12.0;
        Assertions.assertEquals(output1, calculator.operation(calculator.split(enter1)));

        String enter2 = "1 - 7";
        Double output2 = -6.0;
        Assertions.assertEquals(output2, calculator.operation(calculator.split(enter2)));

        String enter3 = "2 * 4";
        Double output3 = 8.0;
        Assertions.assertEquals(output3, calculator.operation(calculator.split(enter3)));

        String enter4 = "7 / 7";
        Double output4 = 1.0;
        Assertions.assertEquals(output4, calculator.operation(calculator.split(enter4)));

    }

    @Test
    public void additionTest(){
        String enter = "5 + 3";
        String result = "8";

        Assertions.assertEquals(result, calculator.expression(enter));
    }

    @Test
    public void subtractionTest(){
        String enter = "10 - 3";
        String result = "7";

        Assertions.assertEquals(result, calculator.expression(enter));
    }

    @Test
    public void multiplicationTest(){
        String enter = "5 * 3";
        String result = "15";

        Assertions.assertEquals(result, calculator.expression(enter));
    }

    @Test
    public void divisionTest(){
        String enter = "9 / 3";
        String result = "3";

        Assertions.assertEquals(result, calculator.expression(enter));
    }

}
