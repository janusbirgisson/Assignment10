package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

public class PlusComposite extends PlusAndMultiplyTemplate implements MathExpression, Observer {

    public int getResult() {
        int result = 0;
        int temp;
        if (children.size() == 0) {
            return 0;
        }

        for (MathExpression child : children) {
            temp = child.getResult();
            result += temp;
        }
        return result;
    }
}
