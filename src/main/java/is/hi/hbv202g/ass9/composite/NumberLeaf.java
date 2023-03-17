package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpression {

    public NumberLeaf(int number) {
        this.number = number;
    }

    private int number;

    public int getResult() {
        return number;
    }
}
