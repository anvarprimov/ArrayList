public class MyArraylist<T> {
    private int current = -1;
    private int len = 4;
    private T[] arr = (T[]) new Object[len];

    public void add(T t) {
        ++current;
        if (current == len){
            len *= 2;
            T[] newArr = (T[]) new Object[len];
            System.arraycopy(arr, 0, newArr, 0, current);
            arr = newArr;
        }
        arr[current]= t;
    }

    public Integer size() {
        return current + 1;
    }

    public T get(Integer index) {
        if (index > current)
            throw new IndexOutOfBoundsException();
        return arr[index];
    }

    public void remove(int index) {
        if (index > current)
            throw new IndexOutOfBoundsException();
        for (int i = index; i < current; i++) {
            arr[i] = arr[i + 1];
        }
        --current;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        if (current >= 0)
            stringBuilder.append(arr[0]);
        for (int i = 1; i <= current; i++) {
            stringBuilder.append(", ").append(arr[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
