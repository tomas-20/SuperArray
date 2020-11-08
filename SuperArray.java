import java.util.Arrays;
public class SuperArray {
  private String[] data;
  private int size;
  private int capacity;
  private void newArray() {
    data = new String[capacity];
    size = 0;
  }
  public SuperArray(int n) {
    capacity = n;
    newArray();
  }
  public SuperArray() {
    capacity = 10;
    newArray();
  }
  public int size() {
    return size;
  }
  public boolean add(String element) {
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size ++;
    return true;
  }
  public String get(int index) {
    return data[index];
  }
  public String set(int index, String element) {
    String output = data[index];
    data[index] = element;
    return output;
  }
  private void resize() {
    int length = data.length;
    String[] nuevo = new String[length * 2];
    for (int i = 0; i < length; i ++) {
      nuevo[i] = data[i];
    }
    data = nuevo;
  }
  public String[] toArray() {
    String[] newList = new String[size];
    for (int i = 0; i < size; i ++) {
      newList[i] = data[i];
    }
    return newList;
  }
  public String toString() {
    return Arrays.toString(toArray());
  }
  public boolean equals(SuperArray other) {
    return Arrays.equals(toArray(), other.toArray());
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public int indexOf(String s) {
    for (int i = 0; i < size; i ++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }
  public int lastIndexOf(String s) {
    for (int i = size - 1; i >= 0; i --) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }
  public boolean contains(String s) {
    return indexOf(s) != -1;
  }
  public void clear() {
    newArray();
  }
  public void add(int index, String element) {
    if (index >= size) {
      add(element);
    }
    else {
      add(index + 1, set(index, element));
    }
  }
  public String remove(int index) {
    String output = data[index];
    if (index >= size) {
      size --;
      data[size] = null;
    }
    else {
      set(index, data[index + 1]);
      remove(index + 1);
    }
    return output;
  }
}
