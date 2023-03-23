package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Super{

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
    private int lastObservedResault;

    public void update() {
        lastObservedResault= getResult();
        System.out.println(lastObservedResault);
    }

    public int getLastObservedResault(){
        return lastObservedResault;
    }
}

