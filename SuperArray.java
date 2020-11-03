import java.util.Arrays;
public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
    size = 0;
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
    String[] nuevo = new String[length + 10];
    for (int i = 0; i < length; i ++) {
      nuevo[i] = data[i];
    }
    data = nuevo;
  }
  public String toString() {
    String[] newList = new String[size];
    for (int i = 0; i < size; i ++) {
      newList[i] = data[i];
    }
    return Arrays.toString(newList);
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public boolean contains(String s) {
    for (int i = 0; i < size; i ++) {
      if (data[i].equals(s)) {
        return true;
      }
    }
    return false;
  }
}
