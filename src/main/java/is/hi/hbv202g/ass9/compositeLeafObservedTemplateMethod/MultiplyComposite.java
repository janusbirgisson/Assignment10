package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite extends PlusAndMultiplyTemplate implements MathExpression, Observer {
    private List<MathExpression> children = new ArrayList<MathExpression>();

    public int getResult() {
        int result=1;
        for (MathExpression child : children) {
            result *= child.getResult();
        }
        return result;
    }

}
