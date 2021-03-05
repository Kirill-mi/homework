package homework4;

import java.lang.reflect.Array;
import java.util.*;


/**
 * homework4
 * 01.02.2021
 * Mikhalochkin Kirill
 */
public class DataContainer<T> implements Iterable<T> {

    private T[] data;

    public DataContainer(Class<T> clazz) {
        data = (T[]) Array.newInstance(clazz, 5);
    }

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Appends the specified item to the free position
     * or(if are occupied) to the end of this list.
     * </T> the class of the objects
     *
     * @param item item to be appended to this list
     * @return int position of item appended to this list.
     * -1 if item==null
     */
    public int add(T item) {
        int count = -1;
        if (item != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    count = i;
                    break;
                } else if (i == data.length - 1) {
                    data = Arrays.copyOf(data, data.length + 1);
                    i++;
                    data[i] = item;
                    count = i;
                }
            }
        }
        return count;
    }

    /**
     * Get the item at the specified position.
     * </T> the class of the objects.
     *
     * @param index position of getting element.
     * @return </T> item at the specified position.
     * null - if the position does not exist.
     */
    public T get(int index) {
        T temp = null;
        if (index < data.length) {
            temp = data[index];
        }
        return temp;
    }

    /**
     * Get all items of object.
     * </T> the class of the objects.
     *
     * @return </T>[]  array of items .
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Delete the  item from the the specified position
     * </T> the class of the objects.
     *
     * @param index position of deleted item
     * @return boolean true- item deleted
     * boolean false-item did not delete
     */
    public boolean delete(int index) {
        boolean flag = false;
        if (index < data.length) {
            flag = true;
            data[index] = null;
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data = Arrays.copyOf(data, data.length - 1);
        }
        return flag;
    }

    /**
     * Delete the  item from object by value
     * </T> the class of the objects.
     *
     * @param item value of deleted item
     * @return boolean true- item deleted
     * boolean false-item did not delete
     */
    public boolean delete(T item) {
        boolean flag = false;
        int temp = data.length;
        for (int i = 0; i < temp; i++) {
            if (data[i] != null && data[i].equals(item)) {
                flag = true;
                for (int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                    temp--;
                }
                data = Arrays.copyOf(data, data.length - 1);
            }
        }
        return flag;
    }

    /**
     * Sort the item of object recorded using the comparison
     * implementation from the passed comparator object
     * not NullPointerException
     * </T> the class of the objects.
     *
     * @param comparator comparator object
     */
    public void sort(Comparator<? super T> comparator) {
        boolean flag = false;
        int temp = data.length;
        do {
            for (int i = 0; i < temp; i++) {
                flag = false;
                if (data[i] == null) {
                    flag = true;
                    for (int j = i; j < data.length - 1; j++) {
                        data[j] = data[j + 1];
                    }
                    temp--;
                }
            }
        } while (flag);
        Arrays.sort(data, 0, temp, comparator);
    }

    /**
     * Returns a string representation of the contents of the specified array
     * * </T> the class of the objects.
     * <p>
     *
     * @return a string representation
     */
    @Override
    public String toString() {
        return "data=" + Arrays.toString(data);
    }

    /**
     * Sort the item of  object  classes implements Comparable
     * not NullPointerException
     * </T> the class of the objects.
     *
     * @param container object of class DataContainer
     */
    public static <T> void sort(DataContainer<T> container) {
        T[] containerItems = container.deleteNullT();
        containerItems = Arrays.copyOf(containerItems, containerItems.length);
        Arrays.sort(containerItems);
        for (T containerItem : containerItems) {
            System.out.print(containerItem);

        }
    }

    /**
     * Sort the item of  object  by  passed object of the Comparator interface
     * not NullPointerException
     * </T> the class of the objects.
     *
     * @param container  object of class DataContainer
     * @param comparator object of the Comparator interface
     */
    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        T[] containerItems = container.deleteNullT();
        containerItems = Arrays.copyOf(containerItems, containerItems.length);
        Arrays.sort(containerItems, comparator);
        for (T containerItem : containerItems) {
            System.out.print(containerItem);
        }
    }

    /**
     * Delete all null in object
     * </T> the class of the objects.
     *
     * @return </T>[]
     */
    public T[] deleteNullT() {
        boolean flag = false;
        int temp = data.length;
        do {
            for (int i = 0; i < temp; i++) {
                flag = false;
                if (data[i] == null) {
                    flag = true;
                    for (int j = i; j < data.length - 1; j++) {
                        data[j] = data[j + 1];
                    }
                    temp--;
                }
            }
        } while (flag);
        return Arrays.copyOf(data, temp);
    }


    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * <p>The returned iterator
     *
     * @return an iterator over the elements in this list in proper sequence
     */
    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }


    private class Itr implements Iterator<T> {
        int cursor;
        int lastIndex = -1;

        @Override
        public boolean hasNext() {
            return cursor != data.length;
        }

        @Override
        public T next() {
            int i = cursor;
            if (i >= data.length)
                throw new NoSuchElementException();
            Object[] elementData = getItems();
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (T) elementData[lastIndex = i];
        }
    }
}
