import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int start) {
    super(start);
  }
  public T set(int i, T value) {
    if (value == null) {
      throw new IllegalArgumentException("arraylist cannot accept null values");
    }
    return super.set(i,value);
  }
  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("arraylist cannot accept null values");
    }
    return super.add(value);
  }
  public void add(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot add null to the ArrayList");
    }
    super.add(index, value);
  }
}
