import java.util.Objects;

public class Expression {

    private Double a;
    private Character operation;
    private Double b;

    public Expression() {
    }

    public Expression(Double a, Character operation, Double b) {
        this.a = a;
        this.operation = operation;
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Character getOperation() {
        return operation;
    }

    public void setOperation(Character operation) {
        this.operation = operation;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expression that = (Expression) o;
        return Objects.equals(a, that.a) && Objects.equals(b, that.b) && Objects.equals(operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, operation);
    }

    @Override
    public String toString() {
        return "Expression{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}
