package design.patterns.behavioral.iterator;
/**
 * @author nayanava
 */

import design.patterns.behavioral.iterator.customiterator.LevelOrderIterator;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        NaryTree<Integer> tree = new NaryTree(1, new LinkedList<>());
        NaryTree<Integer> next = tree;
        next.setChildren(List.of(new NaryTree(2, new LinkedList<>()), new NaryTree(3, new LinkedList<>()), new NaryTree(4, new LinkedList<>())));

        next = next.getChildren().get(0);
        next.setChildren(List.of(new NaryTree(5, new LinkedList<>()), new NaryTree(6, new LinkedList<>())));

        Iterator<NaryTree<Integer>> loIt = new LevelOrderIterator<>(tree);
        while(loIt.hasNext()) {
            System.out.println(loIt.next().getVal());
        }
    }
}
