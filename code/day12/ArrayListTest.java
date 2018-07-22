import java.util.*;
class ArrayListTest{
  public static void main(String[] args){
    ArrayList<Integer> temp = new ArrayList<Integer>();
    temp.add(1);
    temp.add(1);
    temp.add(2);
    temp.add(2);
    Test_method(temp);
  }
  public static void Test_method(ArrayList a){
    ListIterator temp = a.listIterator();
    ArrayList<Object> array = new ArrayList<>();
    while(temp.hasNext()){
      Object p = temp.next();
      if(array.contains(p)){
        temp.remove();
      }
      else{
        array.add(p);
      }
    }
    System.out.println(a);
    // System.out.println(array);
  }

}
