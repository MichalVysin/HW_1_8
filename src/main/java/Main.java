
public class Main {

    public static void main(String[] args){

        Calculator calculator = new Calculator();

        calculator.print(calculator.expression("20 + 5"));
        calculator.print(calculator.expression("20 / 0"));
        calculator.print(calculator.expression("89 / 7"));
        calculator.print(calculator.expression("2.5 * 2.5"));
        calculator.print(calculator.expression("2,5 * 2,5"));






    }

}
