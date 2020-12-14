import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int starting) {
    super(starting);
  }
  public boolean add(T value) {
   if (value == null) {
     throw new IllegalArgumentException("null values cannot be accepted");
   }
   for (int i = 0; i < size(); i++) {
     if (value.compareTo(super.get(i)) <= 0) {
       super.add(i, value);
       return true;
     }
   }
   super.add(value);
   return true;
 }

 public void add(int index, T value) {
   add(value);
 }
}
