package obiektowe.collections.myLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList2_0<E> implements List<E> {

    private MyNode<E> firstNode = null;
    private MyNode<E> lastNode = null;
    private int actualSize = 0;
    @Override
    public boolean add(E e) {
        actualSize++;
        MyNode<E> newNode = new MyNode<>(e);
        if (firstNode == null) {
            firstNode = newNode;
            return true;
        }
        if (firstNode.nextNode==null){
            lastNode = newNode;
            firstNode.nextNode = lastNode;
            lastNode.prevNode = firstNode;
        }
        for (int i = 0; i<=actualSize; i++) {
            if (firstNode.nextNode == null) {
                firstNode.nextNode = newNode;
                return true;
            }
        }

        return true;
    }

    @Override
    public void add(int index, E e) {

    }

    @Override
    public E get(int index) {
        if (actualSize < 0 || index >actualSize){
            throw new IndexOutOfBoundsException();
        }
        MyNode<E> actualNode = firstNode;
        for (int i = 0; i < index; i++){
            actualNode = actualNode.nextNode;
        }

        return actualNode.data;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


    private class MyNode<E> {

        private MyNode<E> prevNode = null;
        private E data;
        private MyNode<E> nextNode = null;

        public MyNode(E data) {
            this.data = data;
        }

    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
