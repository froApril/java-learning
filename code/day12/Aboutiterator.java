import java.util.*;
class Aboutiterator{
  public static void main(String[] args){
    ArrayList<Integer> temp = new ArrayList<Integer>();
    temp.add(1);
    temp.add(2);
    Iterator i = temp.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }

  }
}
