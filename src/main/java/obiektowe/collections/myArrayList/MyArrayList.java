package obiektowe.collections.myArrayList;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private int actualSize;
    private E[] elements = (E[]) new Object[10];


    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public boolean isEmpty() {
        int count = 0;
        for (E e : elements) {
            if (e == null) {
                count++;
            }
        }
        return count == 10;
    }

    @Override
    public boolean contains(Object o) {
        for (E e : elements) {
            if (e == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (e == null) {
            return false;
        }
        elements[actualSize++] = e;
        if (actualSize == elements.length) {
            grow();
        }
        return true;
    }

    private void grow() {  //dodaj 2xtyle miejsca
       /* E[] newArray = (E[]) new Object[elements.length*2];
        for (int i = 0; i< elements.length; i++){
            newArray[i] = elements[i];
        }
        elements = newArray; */
        elements = Arrays.copyOf(elements, elements.length * 2);
    }


   /* public boolean add(E e) {
        if (e==null){
            return false;
        }
        int count = 0;
        boolean check = true;
        while (check) {
            if (elements[count] == null) {
                elements[count] = e;
                check = false;
            } else {
                count++;
            }
        }
        return true;
    }*/

    @Override
    public boolean remove(Object o) {

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public E set(int index, E element) {
        actualSize++;
        if (actualSize == elements.length) {
            grow();
        }
        if (element == null) {
            return null;
        }
        for (int i = 8; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        return null;
    }

    @Override
    public void add(int index, E element) {
        for (int i = actualSize-1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        actualSize++;
        if (actualSize == elements.length) { //jeśli koniec miejsca - powiesz zbior
            grow();
        }
    }

    @Override
    public E remove(int index) {
        for (int i = 0; i < elements.length; i++) {
            elements[index] = elements[index + 1];
            index++;
            if (index == elements.length - 1) {
                return null;
            }
        }
        return null;
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
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
