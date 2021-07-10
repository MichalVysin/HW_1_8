public class Calculator {

    public void print(String expression){
        System.out.println(expression);
    }

    public String expression(String enter) {

        String result = "";

        result = operation(split(enter)).toString();

        if (result.equals("Infinity")){
            result = "Nelze delit nulou!";
        }

        if (result.contains(".") && result.endsWith("0")){
            result = result.substring(0, result.length() - 2);
        }

        return result;
    }

    public Expression split(String enter) {

        String[] splitedEnter = enter.replace(",", ".").split(" ");

        Expression expression = new Expression();

        expression.setA(Double.parseDouble(splitedEnter[0]));
        expression.setOperation(splitedEnter[1].charAt(0));
        expression.setB(Double.parseDouble(splitedEnter[2]));

        return expression;
    }

    private Double addition(Double a, Double b) {
        return a + b;
    }

    private Double subtraction(Double a, Double b) {
        return a - b;
    }

    private Double multiplication(Double a, Double b) {
        return a * b;
    }

    private Double division(Double a, Double b) {

        return a / b;

    }

    public Double operation(Expression expression) {

        Double result = 0.0;

        switch (expression.getOperation()) {
            case '+' -> {
                result = addition(expression.getA(), expression.getB());
                break;
            }
            case '-' -> {
                result = subtraction(expression.getA(), expression.getB());
                break;
            }
            case '*' -> {
                result = multiplication(expression.getA(), expression.getB());
                break;
            }
            case '/' -> {
                result = division(expression.getA(), expression.getB());
                break;
            }

        }
        return result;

    }
}
