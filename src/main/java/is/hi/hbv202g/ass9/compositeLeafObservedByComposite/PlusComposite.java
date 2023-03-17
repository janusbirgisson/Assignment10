package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {

    public PlusComposite(List<MathExpression> children) {
        this.children = children;
    }

    private List<MathExpression> children = new ArrayList<MathExpression>();

    public int getResult() {
        int result = 1;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }
    public void add(MathExpression component) {
        children.add(component);
    }

    public void remove(MathExpression component) {
        children.remove(component); }

    public List<MathExpression> getChildren() { return children;
    }

    public void update() {
    }
}
