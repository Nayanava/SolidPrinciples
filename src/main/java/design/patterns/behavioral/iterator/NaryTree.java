package design.patterns.behavioral.iterator;
/**
 * @author nayanava
 */

import java.io.*;
import java.util.List;

public class NaryTree<T> {
    private T val;
    private List<NaryTree> children;

    public NaryTree() {
    }
    public NaryTree(T val, List<NaryTree> children) {
        this.val = val;
        this.children = children;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public List<NaryTree> getChildren() {
        return children;
    }

    public void setChildren(List<NaryTree> children) {
        this.children = children;
    }

    public static <T> NaryTree populateTree(T[] array) {
        var naryTree = new NaryTree();
        for(T val : array) {

        }
        return naryTree;
    }
}
