package design.patterns.behavioral.iterator.customiterator;
/**
 * @author nayanava
 */

import design.patterns.behavioral.iterator.NaryTree;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderIterator<T> implements Iterator {

    private NaryTree<T> root;
    private Queue<NaryTree> q;

    public LevelOrderIterator(NaryTree root) {
        this.root = root;
        q = new LinkedList<>();
        q.offer(root);
    }
    @Override
    public boolean hasNext() {
        return !q.isEmpty();
    }

    @Override
    public NaryTree next() {
        NaryTree<T> node = q.poll();
        for(NaryTree next : node.getChildren()) {
            q.offer(next);
        }
        return node;
    }
}
