package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

public class NumberLeaf extends Observable implements MathExpression {

    public NumberLeaf(int number) {
        this.number = number;
    }

    private int number;

    public int getResult() {
        return number;
    }

    public void setValue(int number) {
        this.number = number;
        notifyobservers();
    }


}
